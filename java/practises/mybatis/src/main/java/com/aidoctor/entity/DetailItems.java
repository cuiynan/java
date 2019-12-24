package com.aidoctor.entity;

import java.util.Date;

public class DetailItems {
    private String id;

    private String pictureId;

    private String recordId;

    private String detailId;

    private String partPictureUrl;

    private String partPictureResult;

    private Date updateTime;

    private Integer userId;

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

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId == null ? null : detailId.trim();
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
}