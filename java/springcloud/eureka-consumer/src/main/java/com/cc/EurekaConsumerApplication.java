package com.cc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 当前使用feign进行服务的调用，并未实现负载
 * 在项目practis中，使用ribbon+resttemplate已实现负载，但过度依赖配置文件中的调用地址
 * 故:
 * 需要将feign改造，不依赖调用 地址进行。
 *
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
