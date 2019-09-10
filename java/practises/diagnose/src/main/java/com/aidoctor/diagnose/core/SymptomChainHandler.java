package com.aidoctor.diagnose.core;

import com.aidoctor.diagnose.vo.RespiratoryRequest;
import com.aidoctor.diagnose.vo.RespiratoryResponse;

import java.util.Map;

/**
 * @author : cuiyingnan
 * @date : 2019/7/5 16:33
 * @desc :
 */
public class SymptomChainHandler implements ISymptom {

    ISymptom symptom;

    public SymptomChainHandler nextSymptom(ISymptom symptom) {
        this.symptom = symptom;
        return this;
    }

    @Override
    public void diagnose(RespiratoryRequest request, RespiratoryResponse response, ISymptom symptom) {
        this.symptom.diagnose(request, response, symptom);
    }
}
