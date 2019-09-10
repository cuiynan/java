package com.cc.java.serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @ClassName User2
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/2/14 11:55
 **/
@Data
@AllArgsConstructor
@ToString
public class User2 implements Serializable {

    private static final long serialVersionUID = 1L;


    String userName;
    String passWord;
}
