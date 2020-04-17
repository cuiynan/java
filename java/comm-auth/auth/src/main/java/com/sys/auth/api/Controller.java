package com.sys.auth.api;

import com.sys.auth.reponsitory.SysUser;
import com.sys.auth.services.AuthoritySerivce;
import com.sys.auth.vo.LoginRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : cuiyingnan
 * @date : 2020/4/16 16:41
 * @desc :
 */
@Slf4j
@RestController
public class Controller {

    @RequestMapping("/t")
    public String test() {
        return "hello;";
    }

    @Autowired
    AuthoritySerivce authoritySerivce;

    @PostMapping("login")
    public SysUser testss(LoginRequest request) {
        return authoritySerivce.login(request);
    }

    @GetMapping("login-page")
    public String login() {
        return "12341";
    }

    @GetMapping("who")
    public void getWho() {
        log.info(SecurityContextHolder.getContext().getAuthentication().getPrincipal() + "");
    }
}
