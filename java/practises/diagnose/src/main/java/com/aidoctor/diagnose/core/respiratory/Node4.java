package com.aidoctor.diagnose.core.respiratory;

import com.aidoctor.common.AiDoctorConstant;
import com.aidoctor.common.RespiratoryNodesEnum;
import com.aidoctor.diagnose.core.ISymptom;
import com.aidoctor.diagnose.core.Node;
import com.aidoctor.diagnose.core.SymptomChainHandler;
import com.aidoctor.diagnose.vo.RespiratoryRequest;
import com.aidoctor.diagnose.vo.RespiratoryResponse;

import java.util.Map;

/**
 * @author : cuiyingnan
 * @date : 2019/7/5 14:10
 * @desc :
 */
public class Node4 implements ISymptom {
    @Override
    public void diagnose(RespiratoryRequest request, RespiratoryResponse response, ISymptom next) {
        Node node = RespiratoryDepartment.context.get("node4");
        if (request.getIllness().contains(node.getSymptomDesc().getSymptom())) {
            response.getResult().append(node.getSymptomDesc().getFlag());
            response.getResult().append(AiDoctorConstant.SEPARATOR);
        }
        System.out.println("node4");
    }
}
