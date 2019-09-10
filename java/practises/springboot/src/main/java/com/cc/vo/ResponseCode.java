/*
 * Copyright (c) 2015-2025 by HRT All rights reserved
 */
package com.cc.vo;

public enum ResponseCode {

    // *******************************************************
    // ** 说明：

    // ** Restful应用层的错误码在xxx-rest-api工程的单独文件中定义。
    // **
    // ** 响应码类型：E：错误，S：成功
    // **
    // ** 信息类型：
    // ** M：表示数据信息/处理错误类
    // ** B：表示业务信息/处理错误类
    // ** S：表示系统信息/处理错误类
    // ** F：表示文件信息/处理错误类
    // ** D：表示数据库信息/处理错误类
    // ** R: 表示OCR数据信息/处理错误类
    // ** Z：其他类别
    // *******************************************************


    SUCCESS("S0A00000", "成功"),
    ERROR("S0A00000", "系统错误"),

    ;

    private final String code;

    private final String msg;

    ResponseCode(final String code, final String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

}


