package com.erparking.entity;

import lombok.Data;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/4/11 19:21
 **/
@Data
public class Score {
    String card_number;
    String app_key;
    String nonce_str;
    String timestamp;
    String sign;

}
