package com.aidoctor.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.lang.*;
import java.util.*;
import com.aidoctor.pojo.HLog;

/**
 *
 * @author cyn
 * @version v1.0
 * @date 2020-10-27
 */
public interface HLogService {

    void save(HLog record);

    void update(HLog record);

    void remove(Integer id);

    HLog getByPrimaryKey(Integer id);

    List<HLog> getList(HLog record);

    PageInfo<HLog> pageList(HLog record,Integer pageNo,Integer pageSize);
}