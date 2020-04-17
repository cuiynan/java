package com.sys.auth.vo;

import lombok.Data;

/**
 * @author : cuiyingnan
 * @date : 2020/4/16 17:00
 * @desc :
 */
@Data
public class LoginRequest extends BaseRequest {

    String userName;
    String password;
}
