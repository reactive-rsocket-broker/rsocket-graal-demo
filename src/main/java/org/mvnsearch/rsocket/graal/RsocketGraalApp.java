package org.mvnsearch.rsocket.graal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class RsocketGraalApp {

    public static void main(String[] args) {
        SpringApplication.run(RsocketGraalApp.class, args);
    }

}
