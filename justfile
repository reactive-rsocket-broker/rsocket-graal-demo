# rsocket client test
test:
  rsc tcp://localhost:42252 --request --route request-response -d Jackie --debug

# native build
native_build:
   mvn -DskipTests clean package native-image:native-image
   upx -7 -k target/rsocket-graal-demo

# run native image agent to generate related configuration files
native-assist:
  mkdir -p target/native-image
  java -agentlib:native-image-agent=config-output-dir=./target/native-image/ -jar target/rsocket-graal-demo.jar