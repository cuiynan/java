package com.aidoctor.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Outstock {
    private String id;

    private Integer fentryId;

    private Date fdate;

    private String fbillNo;

    private Integer fitemId;

    private String itemNumber;

    private String itemName;

    private String fmodel;

    private Integer fdcStockId;

    private String fdcStock;

    private Integer fdeptId;

    private String deptName;

    private Integer fempId;

    private String yewuyuan;

    private Integer fcusId;

    private String cusNum;

    private String cusName;

    private Integer ecusId;

    private String ecusNum;

    private String ecusName;

    private Integer funitId;

    private String unitName;

    private BigDecimal fqty;

    private BigDecimal fauxqty;

    private BigDecimal fauxPrice;

    private BigDecimal famout;

    private BigDecimal fconsignPrice;

    private BigDecimal fconsignAmout;

    private String fbatchNo;

    private String snlist;

    private Integer fkperiod;

    private Date fkfDate;

    private String forderBillNo;

    private Date createDate;

    private Integer status;

    private String wldh;

    private String ysdw;

    private String dhdh;

    private String orderDate;

    private String llysdh;

    private String llysdw;

    private String fpwldh;

    private String fpysdw;

    private String pkid;

    private String fnote;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getFentryId() {
        return fentryId;
    }

    public void setFentryId(Integer fentryId) {
        this.fentryId = fentryId;
    }

    public Date getFdate() {
        return fdate;
    }

    public void setFdate(Date fdate) {
        this.fdate = fdate;
    }

    public String getFbillNo() {
        return fbillNo;
    }

    public void setFbillNo(String fbillNo) {
        this.fbillNo = fbillNo == null ? null : fbillNo.trim();
    }

    public Integer getFitemId() {
        return fitemId;
    }

    public void setFitemId(Integer fitemId) {
        this.fitemId = fitemId;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber == null ? null : itemNumber.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getFmodel() {
        return fmodel;
    }

    public void setFmodel(String fmodel) {
        this.fmodel = fmodel == null ? null : fmodel.trim();
    }

    public Integer getFdcStockId() {
        return fdcStockId;
    }

    public void setFdcStockId(Integer fdcStockId) {
        this.fdcStockId = fdcStockId;
    }

    public String getFdcStock() {
        return fdcStock;
    }

    public void setFdcStock(String fdcStock) {
        this.fdcStock = fdcStock == null ? null : fdcStock.trim();
    }

    public Integer getFdeptId() {
        return fdeptId;
    }

    public void setFdeptId(Integer fdeptId) {
        this.fdeptId = fdeptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Integer getFempId() {
        return fempId;
    }

    public void setFempId(Integer fempId) {
        this.fempId = fempId;
    }

    public String getYewuyuan() {
        return yewuyuan;
    }

    public void setYewuyuan(String yewuyuan) {
        this.yewuyuan = yewuyuan == null ? null : yewuyuan.trim();
    }

    public Integer getFcusId() {
        return fcusId;
    }

    public void setFcusId(Integer fcusId) {
        this.fcusId = fcusId;
    }

    public String getCusNum() {
        return cusNum;
    }

    public void setCusNum(String cusNum) {
        this.cusNum = cusNum == null ? null : cusNum.trim();
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName == null ? null : cusName.trim();
    }

    public Integer getEcusId() {
        return ecusId;
    }

    public void setEcusId(Integer ecusId) {
        this.ecusId = ecusId;
    }

    public String getEcusNum() {
        return ecusNum;
    }

    public void setEcusNum(String ecusNum) {
        this.ecusNum = ecusNum == null ? null : ecusNum.trim();
    }

    public String getEcusName() {
        return ecusName;
    }

    public void setEcusName(String ecusName) {
        this.ecusName = ecusName == null ? null : ecusName.trim();
    }

    public Integer getFunitId() {
        return funitId;
    }

    public void setFunitId(Integer funitId) {
        this.funitId = funitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    public BigDecimal getFqty() {
        return fqty;
    }

    public void setFqty(BigDecimal fqty) {
        this.fqty = fqty;
    }

    public BigDecimal getFauxqty() {
        return fauxqty;
    }

    public void setFauxqty(BigDecimal fauxqty) {
        this.fauxqty = fauxqty;
    }

    public BigDecimal getFauxPrice() {
        return fauxPrice;
    }

    public void setFauxPrice(BigDecimal fauxPrice) {
        this.fauxPrice = fauxPrice;
    }

    public BigDecimal getFamout() {
        return famout;
    }

    public void setFamout(BigDecimal famout) {
        this.famout = famout;
    }

    public BigDecimal getFconsignPrice() {
        return fconsignPrice;
    }

    public void setFconsignPrice(BigDecimal fconsignPrice) {
        this.fconsignPrice = fconsignPrice;
    }

    public BigDecimal getFconsignAmout() {
        return fconsignAmout;
    }

    public void setFconsignAmout(BigDecimal fconsignAmout) {
        this.fconsignAmout = fconsignAmout;
    }

    public String getFbatchNo() {
        return fbatchNo;
    }

    public void setFbatchNo(String fbatchNo) {
        this.fbatchNo = fbatchNo == null ? null : fbatchNo.trim();
    }

    public String getSnlist() {
        return snlist;
    }

    public void setSnlist(String snlist) {
        this.snlist = snlist == null ? null : snlist.trim();
    }

    public Integer getFkperiod() {
        return fkperiod;
    }

    public void setFkperiod(Integer fkperiod) {
        this.fkperiod = fkperiod;
    }

    public Date getFkfDate() {
        return fkfDate;
    }

    public void setFkfDate(Date fkfDate) {
        this.fkfDate = fkfDate;
    }

    public String getForderBillNo() {
        return forderBillNo;
    }

    public void setForderBillNo(String forderBillNo) {
        this.forderBillNo = forderBillNo == null ? null : forderBillNo.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getWldh() {
        return wldh;
    }

    public void setWldh(String wldh) {
        this.wldh = wldh == null ? null : wldh.trim();
    }

    public String getYsdw() {
        return ysdw;
    }

    public void setYsdw(String ysdw) {
        this.ysdw = ysdw == null ? null : ysdw.trim();
    }

    public String getDhdh() {
        return dhdh;
    }

    public void setDhdh(String dhdh) {
        this.dhdh = dhdh == null ? null : dhdh.trim();
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate == null ? null : orderDate.trim();
    }

    public String getLlysdh() {
        return llysdh;
    }

    public void setLlysdh(String llysdh) {
        this.llysdh = llysdh == null ? null : llysdh.trim();
    }

    public String getLlysdw() {
        return llysdw;
    }

    public void setLlysdw(String llysdw) {
        this.llysdw = llysdw == null ? null : llysdw.trim();
    }

    public String getFpwldh() {
        return fpwldh;
    }

    public void setFpwldh(String fpwldh) {
        this.fpwldh = fpwldh == null ? null : fpwldh.trim();
    }

    public String getFpysdw() {
        return fpysdw;
    }

    public void setFpysdw(String fpysdw) {
        this.fpysdw = fpysdw == null ? null : fpysdw.trim();
    }

    public String getPkid() {
        return pkid;
    }

    public void setPkid(String pkid) {
        this.pkid = pkid == null ? null : pkid.trim();
    }

    public String getFnote() {
        return fnote;
    }

    public void setFnote(String fnote) {
        this.fnote = fnote == null ? null : fnote.trim();
    }
}