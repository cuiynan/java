package com.aidoctor.dao;

import com.aidoctor.entity.UserTableItem;
import com.aidoctor.entity.UserTableItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTableItemMapper {
    int countByExample(UserTableItemExample example);

    int deleteByExample(UserTableItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserTableItem record);

    int insertSelective(UserTableItem record);

    List<UserTableItem> selectByExampleWithBLOBs(UserTableItemExample example);

    List<UserTableItem> selectByExample(UserTableItemExample example);

    UserTableItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserTableItem record, @Param("example") UserTableItemExample example);

    int updateByExampleWithBLOBs(@Param("record") UserTableItem record, @Param("example") UserTableItemExample example);

    int updateByExample(@Param("record") UserTableItem record, @Param("example") UserTableItemExample example);

    int updateByPrimaryKeySelective(UserTableItem record);

    int updateByPrimaryKeyWithBLOBs(UserTableItem record);

    int updateByPrimaryKey(UserTableItem record);
}