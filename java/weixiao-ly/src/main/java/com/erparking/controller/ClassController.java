package com.erparking.controller;

import com.erparking.utils.AES;
import com.erparking.utils.JsonUtils;
import com.erparking.vo.RealRequest;
import com.erparking.vo.Request;
import com.erparking.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 课表
 * @AUTHOR cuiyingnan
 * @DATE 2019/4/11 19:05
 **/
@RestController
@RequestMapping("class")
@Slf4j
public class ClassController {

    @PostMapping("")
    public Response getClasses(Request request) {
        Response response = new Response();

        String R = request.getRaw_data();
        log.info("getClass得到请求：{}", R);
        try {
            String json = AES.unPack(R);
            log.info("getClass R'：{}", json);
            RealRequest realRequest = JsonUtils.json2Obj(json, RealRequest.class);
            log.info("真实request:{}", realRequest);

        } catch (Exception e) {
            log.error("getClass异常", e);
        }

        return response.success("", request.getApp_key());
    }

}
