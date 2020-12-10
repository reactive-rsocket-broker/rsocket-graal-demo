test:
  rsc tcp://localhost:42252 --request --route request-response -d Jackie --debug

native-assist:
  java -agentlib:native-image-agent=config-output-dir=./target/native-image/ -jar target/rsocket-graal-demo-0.0.1-SNAPSHOT.jar