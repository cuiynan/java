package com.cc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.cc"})
public class EurekaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerApplication.class, args);
    }

}
