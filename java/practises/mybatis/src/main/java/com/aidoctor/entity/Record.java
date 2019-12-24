package com.aidoctor.entity;

import java.util.Date;

public class Record {
    private String id;

    private String pictureId;

    private Double rescalefactor;

    private Integer rotatefactor;

    private String chklisttype;

    private Date checktime;

    private Date reporttime;

    private String checkhospital;

    private String operator;

    private String headinfo;

    private Integer userId;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPictureId() {
        return pictureId;
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId == null ? null : pictureId.trim();
    }

    public Double getRescalefactor() {
        return rescalefactor;
    }

    public void setRescalefactor(Double rescalefactor) {
        this.rescalefactor = rescalefactor;
    }

    public Integer getRotatefactor() {
        return rotatefactor;
    }

    public void setRotatefactor(Integer rotatefactor) {
        this.rotatefactor = rotatefactor;
    }

    public String getChklisttype() {
        return chklisttype;
    }

    public void setChklisttype(String chklisttype) {
        this.chklisttype = chklisttype == null ? null : chklisttype.trim();
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public Date getReporttime() {
        return reporttime;
    }

    public void setReporttime(Date reporttime) {
        this.reporttime = reporttime;
    }

    public String getCheckhospital() {
        return checkhospital;
    }

    public void setCheckhospital(String checkhospital) {
        this.checkhospital = checkhospital == null ? null : checkhospital.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getHeadinfo() {
        return headinfo;
    }

    public void setHeadinfo(String headinfo) {
        this.headinfo = headinfo == null ? null : headinfo.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}