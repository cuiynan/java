package com.aidoctor.mapper;

import com.aidoctor.pojo.Product;
import java.util.List;

/**
 *
 * @author cyn
 * @version v1.0
 * @date 2020-08-19
 */
public interface ProductMapper {

    int insert(Product record);

    int update(Product record);

    int del(String id);

    Product selectByPrimaryKey(String id);

    List<Product> selectByRecord(Product record);
}