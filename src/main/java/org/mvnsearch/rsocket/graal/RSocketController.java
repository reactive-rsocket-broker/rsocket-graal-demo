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

    @MessageMapping("request-user")
    public Mono<AppUser> requestUser(String name) {
        AppUser data = new AppUser();
        data.setName(name);
        return Mono.just(data);
    }
}