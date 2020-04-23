package com.aidoctor.entity;

import java.util.Date;

public class User {
    private Integer fitemid;

    private String loginname;

    private String fdescription;

    private Boolean fforbidden;

    private Integer fusertypeid;

    private String fusertypename;

    private Date fcreatetime;

    private String userclass;

    private Integer objectid;

    private String objectnum;

    private String objectname;

    private String wxopenid;

    private String password;

    public Integer getFitemid() {
        return fitemid;
    }

    public void setFitemid(Integer fitemid) {
        this.fitemid = fitemid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getFdescription() {
        return fdescription;
    }

    public void setFdescription(String fdescription) {
        this.fdescription = fdescription;
    }

    public Boolean getFforbidden() {
        return fforbidden;
    }

    public void setFforbidden(Boolean fforbidden) {
        this.fforbidden = fforbidden;
    }

    public Integer getFusertypeid() {
        return fusertypeid;
    }

    public void setFusertypeid(Integer fusertypeid) {
        this.fusertypeid = fusertypeid;
    }

    public String getFusertypename() {
        return fusertypename;
    }

    public void setFusertypename(String fusertypename) {
        this.fusertypename = fusertypename;
    }

    public Date getFcreatetime() {
        return fcreatetime;
    }

    public void setFcreatetime(Date fcreatetime) {
        this.fcreatetime = fcreatetime;
    }

    public String getUserclass() {
        return userclass;
    }

    public void setUserclass(String userclass) {
        this.userclass = userclass;
    }

    public Integer getObjectid() {
        return objectid;
    }

    public void setObjectid(Integer objectid) {
        this.objectid = objectid;
    }

    public String getObjectnum() {
        return objectnum;
    }

    public void setObjectnum(String objectnum) {
        this.objectnum = objectnum;
    }

    public String getObjectname() {
        return objectname;
    }

    public void setObjectname(String objectname) {
        this.objectname = objectname;
    }

    public String getWxopenid() {
        return wxopenid;
    }

    public void setWxopenid(String wxopenid) {
        this.wxopenid = wxopenid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}