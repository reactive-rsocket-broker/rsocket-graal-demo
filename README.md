RSocket GraalVM Native image demo
=================================

# Requirements

* Maven 3.6.x
* GraalVM 20.3.0 with JDK 1.8  https://www.graalvm.org/downloads/

# How to run

```
$ # switch to GraalVM 20.3.0
$ ./compile.sh
$ ./target/rsocket-graal-demo
$ # open a new tab
$ rsc tcp://localhost:42252 --request --route request-response -d Jackie --debug
```

# References

* RSocket: https://rsocket.io/
* GraalVM: https://www.graalvm.org/
* rsc: RSocket Client CLI https://github.com/making/rsc
