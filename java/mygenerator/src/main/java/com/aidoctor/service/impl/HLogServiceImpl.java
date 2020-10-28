package com.aidoctor.service.impl;

import com.aidoctor.pojo.HLog;
import com.aidoctor.mapper.HLogMapper;
import com.aidoctor.service.HLogService;
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
 * @date 2020-10-27
 */
@Service
public class HLogServiceImpl implements HLogService {
    @Autowired
    private HLogMapper hLogMapper;

    @Override
    public void save(HLog record) {
        hLogMapper.insert(record);
    }

    @Override
    public void update(HLog record){
        hLogMapper.update(record);
    }

    @Override
    public void remove(Integer id){
        hLogMapper.del(id);
    }

    @Override
    public HLog getByPrimaryKey(Integer id){
        return hLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<HLog> getList(HLog record){
        return hLogMapper.selectByRecord(record);
    }

    @Override
    public PageInfo<HLog> pageList(HLog record,Integer pageNo,Integer pageSize){
        PageHelper.startPage(pageNo, pageSize);
        List<HLog> list = hLogMapper.selectByRecord(record);
        return new PageInfo<>(list);
    }

}