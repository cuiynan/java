package com.cui.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/1/25 18:08
 **/
@Data
@Document(indexName = "myindx", type = "user", shards = 5, replicas = 1)
public class User implements Serializable {
    @Id
    String id;
    String userName;
    String telNum;
    int age;
    @Field(type = FieldType.Date)
    Date birthDay;
}
