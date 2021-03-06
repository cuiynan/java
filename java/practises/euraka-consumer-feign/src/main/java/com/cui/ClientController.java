package com.cui;

import com.cui.entity.Address;
import com.cui.entity.User;
import com.cui.services.ITest;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import javafx.beans.DefaultProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/2/27 17:05
 **/
@RestController
public class ClientController {

    @Resource
    ITest test;

    @RequestMapping("test")
    public void test() {
        test.test();
    }

    @RequestMapping("save")
    public User save() {
        User user = new User();
        user.setName("测试");
        user.setUid("1");
        Address add = new Address();
        List addrList = new ArrayList<>();
        addrList.add("adfasdjfasfjjasdffaf");
        add.setAddrList(addrList);
        user.setAddr(add);
        user.setPwd("pwd");
        User user1 = test.save(user);
        System.out.println(user1);
        return user1;
    }
}
