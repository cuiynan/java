package com.aidoctor.mapper;

import com.aidoctor.pojo.HLog;
import java.util.List;

/**
 *
 * @author cyn
 * @version v1.0
 * @date 2020-10-27
 */
public interface HLogMapper {

    int insert(HLog record);

    int update(HLog record);

    int del(Integer id);

    HLog selectByPrimaryKey(Integer id);

    List<HLog> selectByRecord(HLog record);
}