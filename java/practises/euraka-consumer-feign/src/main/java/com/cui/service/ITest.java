package com.cui.service;

import com.cui.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/2/28 9:08
 **/
@FeignClient(value = "PROVIDER-FEIN")
public interface ITest {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void test();

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public User save(User user);
}

