package com.aidoctor.reponsitory;

import com.aidoctor.entity.Detail;
import com.aidoctor.entity.DetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DetailMapper {
    int countByExample(DetailExample example);

    int deleteByExample(DetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(Detail record);

    int insertSelective(Detail record);

    List<Detail> selectByExampleWithBLOBs(DetailExample example);

    List<Detail> selectByExample(DetailExample example);

    Detail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Detail record, @Param("example") DetailExample example);

    int updateByExampleWithBLOBs(@Param("record") Detail record, @Param("example") DetailExample example);

    int updateByExample(@Param("record") Detail record, @Param("example") DetailExample example);

    int updateByPrimaryKeySelective(Detail record);

    int updateByPrimaryKeyWithBLOBs(Detail record);

    int updateByPrimaryKey(Detail record);
}