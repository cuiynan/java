package com.aidoctor.diagnose.vo;

import lombok.Data;

/**
 * @author : cuiyingnan
 * @date : 2019/7/5 13:57
 * @desc :
 */
@Data
public class BaseResponse {
    private StringBuffer result = new StringBuffer();

    @Override
    public String toString() {
        return result.toString();
    }
}
