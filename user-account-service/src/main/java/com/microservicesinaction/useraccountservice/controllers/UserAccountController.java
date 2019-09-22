package com.microservicesinaction.useraccountservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAccountController {

    @RequestMapping("/user/prrofile")
    public String foosEndPoint() {
        return "User profile end point data";
    }
}