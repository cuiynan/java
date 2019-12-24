package com.aidoctor.entity;

import java.util.Date;

public class Picture {
    private Integer id;

    private String picUrl;

    private Integer type;

    private Integer allItemsNum;

    private Integer updateItemsNum;

    private Integer userId;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getAllItemsNum() {
        return allItemsNum;
    }

    public void setAllItemsNum(Integer allItemsNum) {
        this.allItemsNum = allItemsNum;
    }

    public Integer getUpdateItemsNum() {
        return updateItemsNum;
    }

    public void setUpdateItemsNum(Integer updateItemsNum) {
        this.updateItemsNum = updateItemsNum;
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