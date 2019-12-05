package com.cui.services;

import com.cui.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/2/27 16:59
 **/
@FeignClient(value = "PROVIDER-FEIN", fallback = ITest.ITestFallBack.class)
public interface ITest {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    void test();

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    User save(User user);

    @Component
    public static class ITestFallBack implements ITest {

        @Override
        public void test() {

        }

        @Override
        public User save(User user) {
            return null;
        }
    }
}
