package com.erparking.vo;

import lombok.Data;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/4/11 19:22
 **/
@Data
public class Response {
    int code;
    String message;
    String raw_data;
    String app_key;

    public Response success(String result, String app_key) {
        this.code = 0;
        this.message = "success";
        this.raw_data = result;
        this.app_key = app_key;
        return this;
    }

    public Response fail(String msg, String app_key) {
        this.code = -1;
        this.message = msg;
        this.raw_data = "";
        this.app_key = app_key;
        return this;
    }
}
