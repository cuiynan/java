package com.cc.erucaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ErucaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErucaServerApplication.class, args);
	}

}
