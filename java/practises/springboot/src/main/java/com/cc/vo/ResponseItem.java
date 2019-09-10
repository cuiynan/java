package com.cc.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/2/11 16:47
 **/
@Data
public class ResponseItem<T> {

    @JsonProperty("returndata")
    T returnData;

    @JsonProperty("returncode")
    String returnCode;

    @JsonProperty("returndesc")
    String returnDesc;

    @JsonProperty("returnstamp")
    @JsonFormat(pattern = "yyyy-MM-dd hh:MM:ss", timezone = "GMT+8")
    Date returnStamp;

}
