package com.sys.auth.reponsitory;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysRoleResourceMapper {
    int countByExample(SysRoleResourceExample example);

    int deleteByExample(SysRoleResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleResource record);

    int insertSelective(SysRoleResource record);

    List<SysRoleResource> selectByExample(SysRoleResourceExample example);

    SysRoleResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysRoleResource record, @Param("example") SysRoleResourceExample example);

    int updateByExample(@Param("record") SysRoleResource record, @Param("example") SysRoleResourceExample example);

    int updateByPrimaryKeySelective(SysRoleResource record);

    int updateByPrimaryKey(SysRoleResource record);
}