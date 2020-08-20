package com.aidoctor.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.lang.*;
import java.util.*;
import com.aidoctor.pojo.Product;

/**
 *
 * @author cyn
 * @version v1.0
 * @date 2020-08-19
 */
public interface ProductService {

    void insert(Product record);

    void update(Product record);

    void del(String id);

    Product selectByPrimaryKey(String id);

    List<Product> getList(Product record);

    PageInfo<Product> pageList(Product record,Integer pageNo,Integer pageSize);
}