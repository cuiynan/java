package com.cui.services;

import com.cui.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/2/27 16:59
 **/
@FeignClient(value = "PROVIDER-FEIN")
public interface ITest {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
     void test();

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    User save(User user);
}
