package com.bohui.technical.register.service.impl;

import com.bohui.technical.register.pojo.register;
import com.bohui.technical.register.mapper.registerMapper;
import com.bohui.technical.register.service.registerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.*;
import java.util.*;

/**
 *
 * @author cuiyingnan
 * @version v1.0
 * @date 2021-03-16
 */
@Service
public class registerServiceImpl implements registerService {
    @Autowired
    private registerMapper registerMapper;

    @Override
    public void save(register record) {
        registerMapper.insert(record);
    }

    @Override
    public void update(register record){
        registerMapper.update(record);
    }

    @Override
    public void remove(Integer id){
        registerMapper.del(id);
    }

    @Override
    public register getByPrimaryKey(Integer id){
        return registerMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<register> getList(register record){
        return registerMapper.selectByRecord(record);
    }

    @Override
    public PageInfo<register> pageList( PageData<register> page){
        PageHelper.startPage(page.getPage(), page.getCapacity());
        List<register> list = registerMapper.selectByRecord(page.getList().get(0));
        return new PageInfo<>(list);
    }

}