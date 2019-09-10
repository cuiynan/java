package com.cc.java.serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/2/14 11:49
 **/
@Data
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    String userName;
    String passWord;
}
