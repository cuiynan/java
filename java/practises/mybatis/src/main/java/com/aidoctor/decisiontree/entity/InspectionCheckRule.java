package com.aidoctor.decisiontree.entity;

public class InspectionCheckRule {
    private Integer id;

    private String type;

    private String sympyomCode;

    private String judgeCondition;

    private String sympyomName;

    private Byte orderNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSympyomCode() {
        return sympyomCode;
    }

    public void setSympyomCode(String sympyomCode) {
        this.sympyomCode = sympyomCode == null ? null : sympyomCode.trim();
    }

    public String getJudgeCondition() {
        return judgeCondition;
    }

    public void setJudgeCondition(String judgeCondition) {
        this.judgeCondition = judgeCondition == null ? null : judgeCondition.trim();
    }

    public String getSympyomName() {
        return sympyomName;
    }

    public void setSympyomName(String sympyomName) {
        this.sympyomName = sympyomName == null ? null : sympyomName.trim();
    }

    public Byte getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Byte orderNum) {
        this.orderNum = orderNum;
    }
}