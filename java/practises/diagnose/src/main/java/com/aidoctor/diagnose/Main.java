package com.aidoctor.diagnose;

import com.aidoctor.diagnose.core.AbstractDepartment;
import com.aidoctor.diagnose.core.respiratory.RespiratoryDepartment;
import com.aidoctor.diagnose.vo.RespiratoryRequest;
import com.aidoctor.diagnose.vo.RespiratoryResponse;

/**
 * @author : cuiyingnan
 * @date : 2019/7/5 13:32
 * @desc : 简单的一个执行的链路过程
 * 按节点分，可以只关注节点的行为（判断条件、结果、下一行为)便可。
 */
public class Main {
    public static void main(String[] args) {

        RespiratoryRequest request = new RespiratoryRequest();
        request.setIllness("咳嗽,咳痰,慢性咳嗽");

        RespiratoryResponse response = new RespiratoryResponse();

        AbstractDepartment department = new RespiratoryDepartment();
        department.diagnose(request, response);

        System.out.println(response.toString());

    }
}
