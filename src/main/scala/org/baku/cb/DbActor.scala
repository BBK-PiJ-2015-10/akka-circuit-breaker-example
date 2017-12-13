package org.baku.cb

import akka.actor.{Actor, ActorLogging, Status}
import akka.pattern.{CircuitBreaker, pipe}

import scala.collection.mutable.HashMap
import scala.concurrent.Future
import scala.concurrent.duration._

class DbActor extends Actor with ActorLogging {

  private var counter = 0

  import context.dispatcher

  val map = new HashMap[String, String]

  val breaker =
    new CircuitBreaker(context.system.scheduler,
      maxFailures = 10,
      callTimeout = 1 seconds,
      resetTimeout = 10 seconds).
      onOpen(log.info("CircuitBreaker is now open, and will not close for one minute")).
      onClose(log.info("CircuitBreaker is now closed.")).
      onHalfOpen(log.info("CircuitBreaker is now half-open."))

  override def receive: Receive = {
    case Get(key) =>
      if (counter <= 30) counter += 1 else counter = 0
      breaker.withCircuitBreaker(sendFromDB(key)) pipeTo sender()

    case Set(key, value) =>
      map.put(key, value)
      sender() ! Status.Success
  }

  private def sendFromDB(key: String) = Future {
    Thread.sleep(995+counter)
    val msg = map.get(key).map(f => s"$f $counter")
    msg.getOrElse(Status.Failure(new Exception(key)))
  }
}
