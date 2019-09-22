package com.microservicesinaction.fooservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    @RequestMapping("/foos")
    public String foosEndPoint() {
        return "Foo";
    }
}