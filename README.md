RSocket GraalVM Native image demo
=================================

# Requirements

* Maven 3.6.x
* GraalVM 20.3.0 with JDK 1.8  https://www.graalvm.org/downloads/

# How to run

```
$ # switch to GraalVM 20.3.0
$ mvn -Pnative -DskipTests clean package 
$ ./target/rsocket-graal-demo
$ # open a new tab
$ rsc tcp://localhost:42252 --request --route request-response -d Jackie --debug
```

# Native assist

Please refer: https://www.graalvm.org/reference-manual/native-image/BuildConfiguration/#assisted-configuration-of-native-image-builds

# Compress executable binary with upx

Compress GraalVM native image binary with upx:

```
$ upx -7 -k target/rsocket-graal-demo 
```

# References

* RSocket: https://rsocket.io/
* GraalVM: https://www.graalvm.org/
* upx: the Ultimate Packer for eXecutables https://github.com/upx/upx
* rsc: RSocket Client CLI https://github.com/making/rsc
* Spring Native for GraalVM documentation: https://repo.spring.io/milestone/org/springframework/experimental/spring-graalvm-native-docs/0.8.5/spring-graalvm-native-docs-0.8.5.zip!/reference/index.html#_overview
