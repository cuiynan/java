package com.erparking.vo;

import lombok.Data;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/4/11 19:40
 **/
@Data
public class RealRequest {
    String card_number;
    String app_key;
    String nonce_str;
    String timestamp;
    String sign;
}
