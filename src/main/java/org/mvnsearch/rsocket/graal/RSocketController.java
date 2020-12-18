package org.mvnsearch.rsocket.graal;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
public class RSocketController {

    @MessageMapping("request-response")
    public Mono<String> requestResponse(String name) {
        return Mono.just("Hello " + name);
    }
}