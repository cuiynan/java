package com.aidoctor.decisiontree.entity;

public class Disease {
    private Integer id;

    private String diseaseCode;

    private String diseaseName;

    private Short orderNum;

    private Integer teamNum;

    private Short decisionTreeCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiseaseCode() {
        return diseaseCode;
    }

    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode == null ? null : diseaseCode.trim();
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName == null ? null : diseaseName.trim();
    }

    public Short getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Short orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getTeamNum() {
        return teamNum;
    }

    public void setTeamNum(Integer teamNum) {
        this.teamNum = teamNum;
    }

    public Short getDecisionTreeCode() {
        return decisionTreeCode;
    }

    public void setDecisionTreeCode(Short decisionTreeCode) {
        this.decisionTreeCode = decisionTreeCode;
    }
}