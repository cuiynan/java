package com.bohui.gps.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/2/22 16:45
 **/
@Data
@RedisHash("user")
public class User implements Serializable {
    @Id
    String id;
    String name;
    String pwd;
    Address addr;
}
