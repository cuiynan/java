package com.erparking.controller;

import com.erparking.entity.ClassBean;
import com.erparking.entity.ClassResult;
import com.erparking.entity.ScoreBean;
import com.erparking.entity.ScoreResult;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 成绩
 * @AUTHOR cuiyingnan
 * @DATE 2019/4/11 19:06
 **/
@Slf4j
@RestController
@RequestMapping("score")
public class ScoreController {

    @PostMapping("")
    public Response getScore(@RequestBody Request request) {
        Response response = new Response();
        String responseValue = "";
        String R = request.getRaw_data();
        log.info("成绩getClass得到请求：{}", R);
        try {
            String json = AES.unPack(R);
            log.info("getClass R'：{}", json);
            RealRequest realRequest = JsonUtils.json2Obj(json, RealRequest.class);
            log.info("真实request:{}", realRequest);

            Map map = new HashMap<>();
            List tmp = new ArrayList();
            for (int i = 1; i < 5; i++) {
                tmp.clear();
                ScoreBean bean = new ScoreBean();
                bean.setCourse_id("0000" + i);
                bean.setCourse_name("数学");
                bean.setScore("90");
                bean.setGpa("4.0");
                tmp.add(bean);
                map.put("20180" + i, tmp);
            }
            List<Map> result = new ArrayList<>();
            result.add(map);
            responseValue = AES.pack(JsonUtils.obj2Json(result));
//            responseValue = JsonUtils.obj2Json(result);
        } catch (Exception e) {
            log.error("getClass异常", e);
        }

        return response.success(responseValue, response.getApp_key());
    }
}
