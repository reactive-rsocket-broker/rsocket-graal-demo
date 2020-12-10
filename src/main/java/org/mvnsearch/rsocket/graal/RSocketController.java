package org.mvnsearch.rsocket.graal;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
public class RSocketController {

    @MessageMapping("request-response")
    public String requestResponse(String name) {
        return "Hello " + name;
    }
}