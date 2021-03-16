package com.bohui.technical.register.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.lang.*;
import java.util.*;
import com.bohui.technical.register.pojo.register;

/**
 *
 * @author cuiyingnan
 * @version v1.0
 * @date 2021-03-16
 */
public interface registerService {

    void save(register record);

    void update(register record);

    void remove(Integer id);

    register getByPrimaryKey(Integer id);

    List<register> getList(register record);

    PageInfo<register> pageList(PageData<register> record);
}