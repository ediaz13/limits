package com.soma.rest.microservices.limitsservice.controller;

import com.soma.rest.microservices.limitsservice.bean.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(1, 10);
    }
}