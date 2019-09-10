package com.cc.vo;

import com.cc.utils.JsonYYYYMMDD;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName User
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/1/14 15:46
 **/
@Data
public class User implements Serializable {
    private String uid;
    private String name;
    private String pwd;
   @JsonFormat(pattern = "yyyy-MM-dd hh:MM:ss",timezone = "GMT+8")
    private Date updateDate = new Date();

   @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate = new Date();
    @NumberFormat(pattern = "#,###,###.#")
    private double chage = 22.12356;
}
