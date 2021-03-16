package com.aidoctor.dao;

import com.aidoctor.entity.Outstock;
import com.aidoctor.entity.OutstockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutstockMapper {
    int countByExample(OutstockExample example);

    int deleteByExample(OutstockExample example);

    int deleteByPrimaryKey(String id);

    int insert(Outstock record);

    int insertSelective(Outstock record);

    List<Outstock> selectByExampleWithBLOBs(OutstockExample example);

    List<Outstock> selectByExample(OutstockExample example);

    Outstock selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Outstock record, @Param("example") OutstockExample example);

    int updateByExampleWithBLOBs(@Param("record") Outstock record, @Param("example") OutstockExample example);

    int updateByExample(@Param("record") Outstock record, @Param("example") OutstockExample example);

    int updateByPrimaryKeySelective(Outstock record);

    int updateByPrimaryKeyWithBLOBs(Outstock record);

    int updateByPrimaryKey(Outstock record);
}