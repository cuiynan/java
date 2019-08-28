package com.erparking.controller;

import com.erparking.entity.ClassBean;
import com.erparking.entity.ClassResult;
import com.erparking.utils.AES;
import com.erparking.utils.JsonUtils;
import com.erparking.vo.RealRequest;
import com.erparking.vo.Request;
import com.erparking.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
    public Response getClasses(@RequestBody Request request) {
        Response response = new Response();
        String responseValue = "";
        String R = request.getRaw_data();
        log.info("课表getClass得到请求：{}", R);
        try {
            String json = AES.unPack(R);
            log.info("getClass R'：{}", json);
            RealRequest realRequest = JsonUtils.json2Obj(json, RealRequest.class);
            log.info("真实request:{}", realRequest);

            ClassResult result = new ClassResult();
            List classBean = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                ClassBean bean = new ClassBean();
                bean.setCourse_id("0000" + i);
                bean.setDay(i + "");
                bean.setWeek(i + "");
                classBean.add(bean);
            }
            result.setTimetable(classBean);
            responseValue = AES.pack(JsonUtils.obj2Json(result));
        } catch (Exception e) {
            log.error("getClass异常", e);
        }
        return response.success(responseValue, response.getApp_key());
    }

}
