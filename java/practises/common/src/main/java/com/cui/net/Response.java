package com.cui.net;

import lombok.Data;

import java.util.Date;

/**
 * @author : cuiyingnan
 * @date : 2019/7/29 16:34
 * @desc :
 */
@Data
public class Response<T> {

    T Return_Data;

    String Return_Code;

    String Return_Desc;

    Date Return_Stamp;
}
