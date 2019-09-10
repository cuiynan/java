package com.aidoctor.diagnose;

import com.aidoctor.common.MyUtils;
import com.aidoctor.common.RespiratoryNodesEnum;
import com.aidoctor.common.RespiratoryResultEnum;
import com.aidoctor.diagnose.core.AbstractDepartment;
import com.aidoctor.diagnose.core.Node;
import com.aidoctor.diagnose.core.respiratory.Node2;
import com.aidoctor.diagnose.core.respiratory.Node3;
import com.aidoctor.diagnose.core.respiratory.Node4;
import com.aidoctor.diagnose.core.respiratory.RespiratoryDepartment;
import com.aidoctor.diagnose.vo.RespiratoryRequest;
import com.aidoctor.diagnose.vo.RespiratoryResponse;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author : cuiyingnan
 * @date : 2019/7/6 9:43
 * @desc :
 */
public class Temp {

    @Test
    @Ignore
    public void test() {
        String s = "231,11,1,2,234,34,3,4,9,7";
        String result = MyUtils.sortedStringHasSeparator(s);
        System.out.println(result);
        System.out.println(RespiratoryResultEnum.RESULT1.getResult()
                .equals(result));
    }

    @Test
    public void t1t() {

//        Node node4 = new Node(RespiratoryNodesEnum.NODE3, null, null);

        RespiratoryRequest request = new RespiratoryRequest();
        request.setIllness("咳嗽,咳痰,慢性咳嗽");
        RespiratoryResponse response = new RespiratoryResponse();
        AbstractDepartment department = new RespiratoryDepartment();
        department.diagnose(request, response);
        System.out.println(response.toString());



    }
}
