package com.aidoctor.common;

/**
 * @author : cuiyingnan
 * @date : 2019/7/6 9:24
 * @desc :
 */
public enum RespiratoryNodesEnum {
    NODE1(1, "咳嗽"),
    NODE2(2, "慢性咳嗽"),
    NODE3(3, "发热"),
    NODE4(4, "咳痰");
//    NODE5(5,"咳嗽");
//    NODE6(6,"咳嗽");


    int flag;
    String symptom;

    RespiratoryNodesEnum(int flag, String symptom) {
        this.flag = flag;
        this.symptom = symptom;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }}

