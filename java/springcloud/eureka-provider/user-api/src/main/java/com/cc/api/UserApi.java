package com.cc.api;

import com.cc.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : cuiyingnan
 * @date : 2019/8/29 17:18
 * @desc : 这里使用nginx + url 进行集群的负载均衡
 * 非常爽。
 * 1，运行起来后，需要在本地配置url 对应的host。
 * 2，配置nginx www.myurl.com对应的集群上点，如：
 * nginx.conf配置以下信息
 * upstream myproject {
 * server 127.0.0.1:9999 weight=3;
 * server 127.0.0.1:9002;
 * }
 * <p>
 * location / {
 * proxy_pass http://myproject;
 * }
 */
//第一种对应单机的时候使用
//@FeignClient(value = "user-svc", url = "user-api:9001/")
//下方可使用url进行集群
@FeignClient(value = "user-svc", url = "www.myurl.com")
@RestController
public interface UserApi {

    @GetMapping("user/{id}")
    List<User> getUsers(@PathVariable("id") String id);

    @PostMapping(path = "user")
    boolean saveUser(@RequestBody User user);

}
