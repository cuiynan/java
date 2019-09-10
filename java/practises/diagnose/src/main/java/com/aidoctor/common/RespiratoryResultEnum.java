package com.aidoctor.common;

/**
 * @author : cuiyingnan
 * @date : 2019/7/6 9:24
 * @desc :
 */
public enum RespiratoryResultEnum {
    RESULT1("[1, 2, 3, 4, 7, 9, 11, 34, 231, 234]", "确诊是慢性的"),
    RESULT2("[1, 2, 3, 4, 7]", "确诊是急性的");


    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    RespiratoryResultEnum(String result, String disease) {
        this.result = result;
        this.disease = disease;
    }

    String result;
    String disease;


}

