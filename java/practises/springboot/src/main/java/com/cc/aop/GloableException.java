package com.cc.aop;

import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @ClassName MyControllerAdvice
 * @Description 使用controllerAdvice定义全局异常类
 * @AUTHOR cuiyingnan
 * @DATE 2019/1/14 18:43
 **/
@ControllerAdvice
@Slf4j
public class GloableException {

    @ExceptionHandler(Exception.class)
    public String hand(Exception e) {
        log.error("系统异常", e);
        return "通用返回错误提示";
    }
}
