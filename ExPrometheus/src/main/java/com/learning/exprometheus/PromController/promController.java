package com.learning.exprometheus.PromController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class promController {

    @GetMapping("/")
    public String index() {
        return "Hello World I am running for Prometheus Monitoring Demo";
    }
}
