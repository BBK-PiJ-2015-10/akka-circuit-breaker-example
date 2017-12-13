# akka-circuit-breaker-example

sbt run to see working example

You should see something similar to:

```
Received: value 2
Received: value 3
Received: value 4
Received: value 5
Received: value 6
Received: value 7
Received: value 8
Received: value 9
Received: value 10
Received: value 11
Received: value 12
Received: value 13
Received: value 14
Received: value 15
Received Error: akka.pattern.CircuitBreaker$$anon$1: Circuit Breaker Timed out.
Received Error: akka.pattern.CircuitBreaker$$anon$1: Circuit Breaker Timed out.
Received Error: akka.pattern.CircuitBreaker$$anon$1: Circuit Breaker Timed out.
Received Error: akka.pattern.CircuitBreaker$$anon$1: Circuit Breaker Timed out.
Received Error: akka.pattern.CircuitBreaker$$anon$1: Circuit Breaker Timed out.
Received Error: akka.pattern.CircuitBreaker$$anon$1: Circuit Breaker Timed out.
Received Error: akka.pattern.CircuitBreaker$$anon$1: Circuit Breaker Timed out.
Received Error: akka.pattern.CircuitBreaker$$anon$1: Circuit Breaker Timed out.
Received Error: akka.pattern.CircuitBreaker$$anon$1: Circuit Breaker Timed out.
Received Error: akka.pattern.CircuitBreaker$$anon$1: Circuit Breaker Timed out.
[INFO] [12/13/2017 16:46:50.422] [CB-akka.actor.default-dispatcher-4] [akka://CB/user/$a] CircuitBreaker is now open, and will not close for one minute
Received Error: akka.pattern.CircuitBreakerOpenException: Circuit Breaker is open; calls are failing fast
Received Error: akka.pattern.CircuitBreaker$$anon$1: Circuit Breaker Timed out.
Received Error: akka.pattern.CircuitBreakerOpenException: Circuit Breaker is open; calls are failing fast
Received Error: akka.pattern.CircuitBreakerOpenException: Circuit Breaker is open; calls are failing fast
Received Error: akka.pattern.CircuitBreakerOpenException: Circuit Breaker is open; calls are failing fast
Received Error: akka.pattern.CircuitBreakerOpenException: Circuit Breaker is open; calls are failing fast
Received Error: akka.pattern.CircuitBreakerOpenException: Circuit Breaker is open; calls are failing fast
Received Error: akka.pattern.CircuitBreakerOpenException: Circuit Breaker is open; calls are failing fast
Received Error: akka.pattern.CircuitBreakerOpenException: Circuit Breaker is open; calls are failing fast
Received Error: akka.pattern.CircuitBreakerOpenException: Circuit Breaker is open; calls are failing fast
Received Error: akka.pattern.CircuitBreakerOpenException: Circuit Breaker is open; calls are failing fast
Received Error: akka.pattern.CircuitBreakerOpenException: Circuit Breaker is open; calls are failing fast
[INFO] [12/13/2017 16:47:00.428] [CB-akka.actor.default-dispatcher-2] [akka://CB/user/$a] CircuitBreaker is now half-open.
Received Error: akka.pattern.CircuitBreakerOpenException: Circuit Breaker is open; calls are failing fast
Received: value 6
[INFO] [12/13/2017 16:47:02.158] [CB-akka.actor.default-dispatcher-4] [akka://CB/user/$a] CircuitBreaker is now closed.
Received: value 8
Received: value 9
Received: value 10
```