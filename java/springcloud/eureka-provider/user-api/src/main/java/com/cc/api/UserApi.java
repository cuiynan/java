package com.cc.api;

import com.cc.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author : cuiyingnan
 * @date : 2019/8/29 17:18
 * @desc :
 */
@FeignClient(value = "user-svc", url = "user-api:9001/user-services/")
public interface UserApi {

    @GetMapping(path = "user")
    List<User> getUsers();

    @PostMapping(path = "user")
    boolean saveUser(User user);

}
