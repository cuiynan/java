package com.cc.vo;

import lombok.Data;

/**
 * @Description 全局异常捕获类
 * @AUTHOR cuiyingnan
 * @DATE 2019/3/6 11:17
 **/
@Data
public class ApiRequest<T> {
    private Request<T> request;

    public T getBody() {
        return request.getBody();
    }
}
