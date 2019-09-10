package com.cc.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName Test
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/1/29 15:38
 **/

@RestController
@Api(value = "用户管理", tags = "类测试")
@RequestMapping("user")
public class Test {

    @GetMapping("")
    @ApiOperation(value = "分页查询用户", response = User.class, httpMethod = "GET")
    @ApiResponse(code = 400, message = "请求参数没填好")
    public User test1() {
        User user = new User();
        user.setName(";ajdf");
        user.setPwd("121234");
        return user;
    }

    @DeleteMapping("{id}")
    @ApiOperation(value = "依据用户ID删除用户", response = String.class, httpMethod = "DELETE")
    @ApiResponse(code = 400, message = "请求参数没填好")
    public User delete(@PathVariable("id") String id) {
        User user = new User();
        user.setName(id);
        return user;
    }

    @GetMapping("{id}")
    @ApiOperation(value = "依据用户ID查询", response = String.class)
    @ApiResponse(code = 400, message = "请求参数没填好")
    public User search(@PathVariable("id") String id) {
        User user = new User();
        user.setName(id);
        return user;
    }

    @PutMapping("")
    @ApiOperation(value = "按用户ID 进行更改", response = User.class, httpMethod = "PUT")
    @ApiResponse(code = 400, message = "请求参数没填好")
    public User update(User user) {
        return user;
    }

    @ApiOperation(value = "保存用户", response = User.class, httpMethod = "POST")
    @ApiResponse(code = 400, message = "请求参数没填好")
    @PostMapping("")
    public User save(@RequestBody User user) {
        return user;
    }


}
