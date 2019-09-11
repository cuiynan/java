package com.cc.api;

import com.cc.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : cuiyingnan
 * @date : 2019/8/29 17:18
 * @desc :
 */
@FeignClient(value = "user-svc", url = "user-api:9001/")
@RestController
public interface UserApi {

    @GetMapping("user/{id}")
    List<User> getUsers(@PathVariable("id") String id);

    @PostMapping(path = "user")
    boolean saveUser(@RequestBody User user);

}
