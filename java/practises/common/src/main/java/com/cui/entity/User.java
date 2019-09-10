package com.cui.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/2/22 16:45
 **/
@Data
@ToString
public class User implements Serializable {
    private String uid;
    private String name;
    private String pwd;
    private Date updateDate;
    private Date createDate;
    private double chage = 22.12356;
    private Address addr;
}
