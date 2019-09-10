package com.bohui.gps.controller;

import com.bohui.gps.vo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/2/22 16:44
 **/
@Controller
@RestController
@RequestMapping("test")
public class TController {

    @GetMapping("")
    public UserVo test() {
        UserVo user = new UserVo();
        user.setName("1adfjaf中文jdj");
        user.setPwd("f;jf;aj;");
        return user;
    }
}
