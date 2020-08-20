package com.aidoctor.service.impl;

import com.aidoctor.pojo.Product;
import com.aidoctor.mapper.ProductMapper;
import com.aidoctor.service.ProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.*;
import java.util.*;

/**
 *
 * @author cyn
 * @version v1.0
 * @date 2020-08-19
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public void insert(Product record) {
        productMapper.insert(record);
    }

    @Override
    public void update(Product record){
        productMapper.update(record);
    }

    @Override
    public void del(String id){
        productMapper.del(id);
    }

    @Override
    public Product selectByPrimaryKey(String id){
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Product> getList(Product record){
        return productMapper.selectByRecord(record);
    }

    @Override
    public PageInfo<Product> pageList(Product record,Integer pageNo,Integer pageSize){
        PageHelper.startPage(pageNo, pageSize);
        List<Product> list = productMapper.selectByRecord(record);
        return new PageInfo<>(list);
    }

}