package com.sys;

import net.hasor.spring.boot.EnableHasor;
import net.hasor.spring.boot.EnableHasorWeb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.sys" })
@EnableHasor
@EnableHasorWeb
public class CodesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodesApplication.class, args);
    }

}
