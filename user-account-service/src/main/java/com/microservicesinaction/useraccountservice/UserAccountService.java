package com.microservicesinaction.useraccountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UserAccountService {

    public static void main(String[] args) {
        SpringApplication.run(UserAccountService.class, args);
    }
}