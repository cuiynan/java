package com.cc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ClientController
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/1/16 9:51
 **/
@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping()
    public String client1() {
        String url = "http://provider1-service/provider";
        return restTemplate.getForEntity(url, String.class).getBody();
    }
}
