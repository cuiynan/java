package com.cc.vo;

import lombok.Data;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/3/5 14:45
 **/
@Data
public class Request<T> {

    private Object header;

    private T body;

}
