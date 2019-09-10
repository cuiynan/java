package com.cc.service.service;

import com.cc.servies.Test2;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/3/18 13:41
 **/
//@RestController
@Service
public class ServiceTest implements Test2 {
    @Override
    public String save(@RequestParam("name") String name) {
        System.out.println("-----保存成功-111-----");

        return "12334mmsdljflaksdn";
    }
}
