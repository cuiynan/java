package com.aidoctor.entity;

import java.util.Date;

public class Detail {
    private String id;

    private String pictureId;

    private String recordId;

    private String stdname;

    private String name;

    private Double floatValue;

    private String reference;

    private String tip;

    private String partPictureUrl;

    private String partPictureResult;

    private Date updateTime;

    private Integer userId;

    private Integer type;

    private byte[] unit;

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

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getStdname() {
        return stdname;
    }

    public void setStdname(String stdname) {
        this.stdname = stdname == null ? null : stdname.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(Double floatValue) {
        this.floatValue = floatValue;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference == null ? null : reference.trim();
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip == null ? null : tip.trim();
    }

    public String getPartPictureUrl() {
        return partPictureUrl;
    }

    public void setPartPictureUrl(String partPictureUrl) {
        this.partPictureUrl = partPictureUrl == null ? null : partPictureUrl.trim();
    }

    public String getPartPictureResult() {
        return partPictureResult;
    }

    public void setPartPictureResult(String partPictureResult) {
        this.partPictureResult = partPictureResult == null ? null : partPictureResult.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public byte[] getUnit() {
        return unit;
    }

    public void setUnit(byte[] unit) {
        this.unit = unit;
    }
}