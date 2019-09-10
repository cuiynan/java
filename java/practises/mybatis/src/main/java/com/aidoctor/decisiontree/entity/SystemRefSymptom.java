package com.aidoctor.decisiontree.entity;

public class SystemRefSymptom {
    private Integer id;

    private String sympyomCode;

    private String sympyomName;

    private String decisionTreeNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSympyomCode() {
        return sympyomCode;
    }

    public void setSympyomCode(String sympyomCode) {
        this.sympyomCode = sympyomCode == null ? null : sympyomCode.trim();
    }

    public String getSympyomName() {
        return sympyomName;
    }

    public void setSympyomName(String sympyomName) {
        this.sympyomName = sympyomName == null ? null : sympyomName.trim();
    }

    public String getDecisionTreeNum() {
        return decisionTreeNum;
    }

    public void setDecisionTreeNum(String decisionTreeNum) {
        this.decisionTreeNum = decisionTreeNum == null ? null : decisionTreeNum.trim();
    }
}