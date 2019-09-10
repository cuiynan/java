package com.cc.vo;

import lombok.Data;

import java.util.Date;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/2/11 16:38
 **/
@Data
public class ApiResponse<T> {
    ResponseItem<T> response;

    /**
     * 系统错误
     */
    public static ApiResponse error(ResponseCode code) {
        return result(code, null);
    }

    /**
     * 成功返回
     */
    public static <T> ApiResponse sucess(T data) {
        return result(ResponseCode.SUCCESS, data);
    }

    /**
     * 业务错误信息
     */
    public static <T> ApiResponse sucess(ResponseCode code, T data) {
        return result(code, data);
    }


    /**
     * 返回对象信息
     *
     * @param data
     */
    private static <T> ApiResponse result(ResponseCode code, T data) {
        ApiResponse result = new ApiResponse();
        ResponseItem response = new ResponseItem<>();
        response.setReturnCode(code.getCode());
        response.setReturnDesc(code.getMsg());
        response.setReturnData(data);
        response.setReturnStamp(new Date());
        result.setResponse(response);
        return result;
    }
}
