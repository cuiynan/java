package com.aidoctor.diagnose.core.respiratory;

import com.aidoctor.common.RespiratoryNodesEnum;
import com.aidoctor.diagnose.core.AbstractDepartment;
import com.aidoctor.diagnose.core.Node;
import com.aidoctor.diagnose.core.SymptomChainHandler;
import com.aidoctor.diagnose.vo.BaseRequest;
import com.aidoctor.diagnose.vo.BaseResponse;
import com.aidoctor.diagnose.vo.RespiratoryRequest;
import com.aidoctor.diagnose.vo.RespiratoryResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : cuiyingnan
 * @date : 2019/7/5 13:39
 * @desc : 呼吸科
 */
public class RespiratoryDepartment extends AbstractDepartment {

    public static Map<String, Node> context = new HashMap<>();

    static {
        Node node1 = new Node(RespiratoryNodesEnum.NODE1, new Node2(), new Node3());
        Node node2 = new Node(RespiratoryNodesEnum.NODE2, new Node3(), null);
        Node node3 = new Node(RespiratoryNodesEnum.NODE3, new Node4(), new Node4());
        Node node4 = new Node(RespiratoryNodesEnum.NODE4, null, null);

        context.put("node1", node1);
        context.put("node2", node2);
        context.put("node3", node3);
        context.put("node4", node4);
    }


    @Override
    public void execute(BaseRequest request, BaseResponse response) {
        //在node1中入口开始执行
        SymptomChainHandler dialog = new SymptomChainHandler();
        dialog.nextSymptom(new Node1());
        dialog.diagnose((RespiratoryRequest) request, (RespiratoryResponse) response, dialog);
    }
}
