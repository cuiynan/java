package com.cc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/3/7 16:09
 **/
@Slf4j
@Component
public class Sl4jLog {
    public void log() {
        log.error("这里真记录日志了吗？");
    }
}
