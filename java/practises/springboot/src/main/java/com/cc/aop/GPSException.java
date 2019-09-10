package com.cc.aop;

import com.cc.vo.ResponseCode;
import lombok.Data;

/**
 * @Description 自定义异常
 * @AUTHOR cuiyingnan
 * @DATE 2019/3/6 11:49
 **/
@Data
public class GPSException extends RuntimeException {

    ResponseCode responseCode;

    /**
     * 异常处理
     */
    public static GPSException exception(ResponseCode responseCode, Exception e) {
        return new GPSException(responseCode, e);
    }

    private GPSException(ResponseCode responseCode, Exception e) {
        super(responseCode.getMsg(), e);
        this.responseCode = responseCode;
    }

}
