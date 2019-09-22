package com.microservicesinaction.webappservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class WebAppService {

    public static void main(String[] args) {
        SpringApplication.run(WebAppService.class, args);
    }
}