package com.aidoctor.diagnose.core;

import com.aidoctor.diagnose.vo.BaseRequest;
import com.aidoctor.diagnose.vo.BaseResponse;

/**
 * @author : cuiyingnan
 * @date : 2019/7/5 13:33
 * @desc :
 */
public abstract class AbstractDepartment {

    public void diagnose(BaseRequest request, BaseResponse response) {
        this.execute(request, response);
    }

    protected abstract void execute(BaseRequest request, BaseResponse response);
}
