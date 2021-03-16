package com.bohui.technical.register.mapper;

import com.bohui.technical.register.pojo.register;
import java.util.List;

/**
 *
 * @author cuiyingnan
 * @version v1.0
 * @date 2021-03-16
 */
public interface registerMapper {

    int insert(register record);

    int update(register record);

    int del(Integer id);

    register selectByPrimaryKey(Integer id);

    List<register> selectByRecord(register record);
}