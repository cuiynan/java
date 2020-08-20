package com.aidoctor.pojo;

import java.lang.*;
import java.util.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 *
 * @author cyn
 * @version v1.0
 * @date 2020-08-19
 */
@ApiModel("价格管理")
@Data
@Accessors(chain = true)
public class Product {

    /****/
    @ApiModelProperty(value = "")
    private String id;

    /**产品代码**/
    @ApiModelProperty(value = "产品代码")
    private String productCode;

    /**产品名称**/
    @ApiModelProperty(value = "产品名称")
    private String productName;

    /**产品简称**/
    @ApiModelProperty(value = "产品简称")
    private String productShortName;

    /**产品型号**/
    @ApiModelProperty(value = "产品型号")
    private String productType;

    /**单位**/
    @ApiModelProperty(value = "单位")
    private String productUnit;

    /**包装规格**/
    @ApiModelProperty(value = "包装规格")
    private String packStandard;

    /**产品线**/
    @ApiModelProperty(value = "产品线")
    private String prodctLine;

    /**产品大类**/
    @ApiModelProperty(value = "产品大类")
    private String productBType;

    /**产品小类**/
    @ApiModelProperty(value = "产品小类")
    private String productSType;

    /**产品线ID**/
    @ApiModelProperty(value = "产品线ID")
    private String dictionariesIdLineType;

    /**产品大类ID**/
    @ApiModelProperty(value = "产品大类ID")
    private String dictionariesIdBtype;

    /**产品小类ID**/
    @ApiModelProperty(value = "产品小类ID")
    private String dictionariesIdStype;

    /**最小单位转换率**/
    @ApiModelProperty(value = "最小单位转换率")
    private Float smallUnit;

    /****/
    @ApiModelProperty(value = "")
    private Date createDate;

    /**erp代码**/
    @ApiModelProperty(value = "erp代码")
    private String erpCode;

    /**产品说明**/
    @ApiModelProperty(value = "产品说明")
    private String productDesc;

    /**0有效1无效**/
    @ApiModelProperty(value = "0有效1无效")
    private Integer status;
}