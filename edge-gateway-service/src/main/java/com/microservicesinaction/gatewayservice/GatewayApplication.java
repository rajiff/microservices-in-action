package com.microservicesinaction.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import com.microservicesinaction.gatewayservice.fitlers.pre.GatewayLoggingFilter;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class GatewayApplication {

  public static void main(String[] args) {
    SpringApplication.run(GatewayApplication.class, args);
  }
  
  @Bean
  public GatewayLoggingFilter loggingFilter() {
    return new GatewayLoggingFilter();
  }

}