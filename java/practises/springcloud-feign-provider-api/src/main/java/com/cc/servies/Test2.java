package com.cc.servies;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/2/28 9:08
 **/
@FeignClient(name = "t", url = "localhost:8080/")
@RestController
public interface Test2 {

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    String save(@RequestParam("name") String name);


}

