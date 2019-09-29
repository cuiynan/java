package com.aidoctor.decisiontree.reponsitory;

import com.aidoctor.decisiontree.entity.InspectionCheck;
import com.aidoctor.decisiontree.entity.InspectionCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectionCheckMapper {
    int countByExample(InspectionCheckExample example);

    int deleteByExample(InspectionCheckExample example);

    int deleteByPrimaryKey(Short id);

    int insert(InspectionCheck record);

    int insertSelective(InspectionCheck record);

    List<InspectionCheck> selectByExample(InspectionCheckExample example);

    InspectionCheck selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") InspectionCheck record, @Param("example") InspectionCheckExample example);

    int updateByExample(@Param("record") InspectionCheck record, @Param("example") InspectionCheckExample example);

    int updateByPrimaryKeySelective(InspectionCheck record);

    int updateByPrimaryKey(InspectionCheck record);
}