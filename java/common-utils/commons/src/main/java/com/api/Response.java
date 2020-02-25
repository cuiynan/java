package com.api;

import lombok.Data;

import java.util.Date;

/**
 * @author : cuiyingnan
 * @date : 2019/12/26 18:21
 * @desc :
 */
@Data
public final class Response<T> {
    /**
     * code
     */
    int c;
    /**
     * msg
     */
    String msg;
    /**
     * 对象
     */
    T obj;
    /**
     *
     */
    Date t;

    public static <T> Response SUCCESS(T t) {
        return result(200, t);
    }

    public static <T> Response ERROR(T t, String msg) {
        return result(500, t, msg);
    }

    private static <T> Response result(int code, T t, String... msg) {
        Response response = new Response();
        response.setC(code);
        if (msg.length > 0) {
            response.setMsg(msg[0]);
        }
        response.setObj(t);
        response.setT(new Date());
        return response;
    }
}
