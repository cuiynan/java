package com.cc.aop;

import com.cc.vo.ApiResponse;
import com.cc.vo.ResponseCode;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description 全局异常捕获类
 * @AUTHOR cuiyingnan
 * @DATE 2019/3/6 11:17
 **/
@ControllerAdvice
@Slf4j
public class GloableExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ApiResponse defaultExeptionHandler(Exception e) {
        if (e instanceof GPSException) {
            log.error(e.getMessage(), e);
            return ApiResponse.error(((GPSException) e).getResponseCode());
        }

        if (e instanceof Exception) {
            log.error("系统运行时异常", e);
        }
        return ApiResponse.error(ResponseCode.ERROR);
    }
}
