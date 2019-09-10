package com.cc.api;

import com.cc.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : cuiyingnan
 * @date : 2019/8/29 17:18
 * @desc :
 */
@FeignClient(value = "user-svc", url = "user-api:9001/")
@RestController
public interface UserApi {

    @RequestMapping(value = "user", method = RequestMethod.GET)
    List<User> getUsers();

    @PostMapping(path = "user")
    boolean saveUser(User user);

}
