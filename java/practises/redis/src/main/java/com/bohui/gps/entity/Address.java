package com.bohui.gps.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/2/25 16:27
 **/
@Data
public class Address implements Serializable {

    List<String> addrList;
}
