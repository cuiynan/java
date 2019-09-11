package com.cc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author cuiyingnan
 */
@EnableFeignClients(basePackages = "com")
@EnableDiscoveryClient
@SpringBootApplication
//@EnableDiscoveryClient
//@SpringBootApplication
////这里也可以指定自己的实现
//@RibbonClient(value = "user-services", configuration = RandomRule.class)
public class EurekaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerApplication.class, args);
    }

}
