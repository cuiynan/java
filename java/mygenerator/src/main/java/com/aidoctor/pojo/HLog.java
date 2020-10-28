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
 * @date 2020-10-27
 */
@ApiModel("价格管理")
@Data
@Accessors(chain = true)
public class HLog {

    /****/
    @ApiModelProperty(value = "")
    private Integer id;

    /****/
    @ApiModelProperty(value = "")
    private Date createDate;

    /****/
    @ApiModelProperty(value = "")
    private String ip;

    /****/
    @ApiModelProperty(value = "")
    private String modelName;

    /****/
    @ApiModelProperty(value = "")
    private String modelMethod;

    /****/
    @ApiModelProperty(value = "")
    private String requestParam;

    /****/
    @ApiModelProperty(value = "")
    private String responseParam;
}