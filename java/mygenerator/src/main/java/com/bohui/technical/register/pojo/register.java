package com.bohui.technical.register.pojo;

import java.lang.*;
import java.util.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
*
* @author cuiyingnan
    * @version v1.0
* @date 2021-03-16
*/
@ApiModel("工作简介")
@Data
@Accessors(chain = true)
public class register {

    /**id**/
    @ApiModelProperty(value = "id")
        private Integer id;

    /**客户名称**/
    @ApiModelProperty(value = "客户名称")
        private String cusName;

    /**客户性质**/
    @ApiModelProperty(value = "客户性质")
        private String cusType;

    /**专科方向**/
    @ApiModelProperty(value = "专科方向")
        private String cusKind;

    /**等级**/
    @ApiModelProperty(value = "等级")
        private String cusLevel;

    /**科室**/
    @ApiModelProperty(value = "科室")
        private String cus;

    /**大区**/
    @ApiModelProperty(value = "大区")
        private String bhArea;

    /**省份**/
    @ApiModelProperty(value = "省份")
        private String cusProvince;

    /**地址**/
    @ApiModelProperty(value = "地址")
        private String cusAddress;

    /**产品线**/
    @ApiModelProperty(value = "产品线")
        private String productLine;

    /**仪器型号**/
    @ApiModelProperty(value = "仪器型号")
        private String productType;

    /**仪器序列号**/
    @ApiModelProperty(value = "仪器序列号")
        private String productSn;

    /**安装时间**/
    @ApiModelProperty(value = "安装时间")
        private String productInstallDate;

    /**负责工程师**/
    @ApiModelProperty(value = "负责工程师")
        private String bhEngineer;

    /**设备状态**/
    @ApiModelProperty(value = "设备状态")
        private String productState;

    /**仪器属性**/
    @ApiModelProperty(value = "仪器属性")
        private String productProperty;

    /**使用场地照片**/
    @ApiModelProperty(value = "使用场地照片")
        private String productPicEnvironment;

    /**产品服务卡照片或产品铭牌照片**/
    @ApiModelProperty(value = "产品服务卡照片或产品铭牌照片")
        private String productPic;

    /**竞品仪器照片**/
    @ApiModelProperty(value = "竞品仪器照片")
        private String productOtherPic;

    /**月用量信息**/
    @ApiModelProperty(value = "月用量信息")
        private String productUsedNum;

    /**注册时间**/
    @ApiModelProperty(value = "注册时间")
        private Date createTime;

    /**微信号ID openId**/
    @ApiModelProperty(value = "微信号ID openId")
        private String wechatNo;

}