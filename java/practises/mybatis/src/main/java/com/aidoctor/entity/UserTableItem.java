package com.aidoctor.entity;

import java.util.Date;

public class UserTableItem {
    private String id;

    private Integer userId;

    private String route;

    private Date updateTime;

    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route == null ? null : route.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}