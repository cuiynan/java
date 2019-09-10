package com.cc.controller;

import com.cc.vo.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author cuiyingnan
 */
@RestController
public class SampleController {

    /**
     * 全局配置
     * 用于练手返回json、xml
     * 前端调用方式：
     * /user/1?username=xxx
     * or
     * /user/1
     */
    @GetMapping("/users/{id}")
    public User all(@PathVariable String id,
                    @RequestParam(required = false) String userName) {
        return getUser(id, userName);
    }

    /***
     * ######################################################
     * /user1/*  相关的路径带上 produces和consumers 与 ExpandWebMvcConfigurer冲突，需二者留其一。
     * ######################################################
     */


    /**
     * 局部配置 json to xml
     */
    @GetMapping(value = "/user1/{id}",
            produces = MediaType.APPLICATION_XML_VALUE,//Accept
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)//Content-Type
    public User JSON2Xml(@PathVariable String id,
                         @RequestParam(required = false) String userName) {
        return getUser(id, userName);
    }


    /**
     * 局部配置 xml to json
     */
    @GetMapping(value = "/user2/{id}",
            //produces = MediaType.APPLICATION_JSON_UTF8_VALUE,//Accept
            consumes = MediaType.APPLICATION_XML_VALUE)//Content-Type
    public User Xml2JSON(@RequestBody User user) {
        return user;
    }

    private User getUser(String id, String userName) {
        User user = new User();
        user.setChage(1);
        user.setName(userName);
        user.setUid(id);
        return user;
    }
}
