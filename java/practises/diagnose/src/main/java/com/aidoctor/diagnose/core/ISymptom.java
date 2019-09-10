package com.aidoctor.diagnose.core;

import com.aidoctor.diagnose.vo.RespiratoryRequest;
import com.aidoctor.diagnose.vo.RespiratoryResponse;

/**
 * @author : cuiyingnan
 * @date : 2019/7/5 14:04
 * @desc :
 */
public interface ISymptom {

    void diagnose(RespiratoryRequest request, RespiratoryResponse response, ISymptom symptom);
}
