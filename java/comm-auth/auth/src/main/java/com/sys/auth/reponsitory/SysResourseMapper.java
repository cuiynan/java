package com.sys.auth.reponsitory;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysResourseMapper {
    int countByExample(SysResourseExample example);

    int deleteByExample(SysResourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysResourse record);

    int insertSelective(SysResourse record);

    List<SysResourse> selectByExample(SysResourseExample example);

    SysResourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysResourse record, @Param("example") SysResourseExample example);

    int updateByExample(@Param("record") SysResourse record, @Param("example") SysResourseExample example);

    int updateByPrimaryKeySelective(SysResourse record);

    int updateByPrimaryKey(SysResourse record);
}