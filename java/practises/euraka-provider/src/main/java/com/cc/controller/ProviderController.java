package com.cc.controller;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ProviderController
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/1/16 15:54
 **/
@RestController
@RequestMapping("provider")
public class ProviderController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping
    public String provider() {
        System.out.println(discoveryClient.getServices());
        System.out.println("here is run!");

        return "provider1";
    }
}
