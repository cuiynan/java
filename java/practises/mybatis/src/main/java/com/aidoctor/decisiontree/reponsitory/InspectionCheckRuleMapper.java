package com.aidoctor.decisiontree.reponsitory;

import com.aidoctor.decisiontree.entity.InspectionCheckRule;
import com.aidoctor.decisiontree.entity.InspectionCheckRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectionCheckRuleMapper {
    int countByExample(InspectionCheckRuleExample example);

    int deleteByExample(InspectionCheckRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InspectionCheckRule record);

    int insertSelective(InspectionCheckRule record);

    List<InspectionCheckRule> selectByExample(InspectionCheckRuleExample example);

    InspectionCheckRule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InspectionCheckRule record, @Param("example") InspectionCheckRuleExample example);

    int updateByExample(@Param("record") InspectionCheckRule record, @Param("example") InspectionCheckRuleExample example);

    int updateByPrimaryKeySelective(InspectionCheckRule record);

    int updateByPrimaryKey(InspectionCheckRule record);
}