package com.aidoctor.diagnose.core;

import com.aidoctor.common.RespiratoryNodesEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author : cuiyingnan
 * @date : 2019/7/8 14:05
 * @desc :
 */
@Data
@AllArgsConstructor
public class Node {

    private RespiratoryNodesEnum symptomDesc;
    private ISymptom left;
    private ISymptom right;

}
