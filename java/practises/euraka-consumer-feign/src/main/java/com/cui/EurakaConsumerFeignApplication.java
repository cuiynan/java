package com.cui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
//@SpringCloudApplication
//@EnableCircuitBreaker
public class EurakaConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurakaConsumerFeignApplication.class, args);
    }

}
