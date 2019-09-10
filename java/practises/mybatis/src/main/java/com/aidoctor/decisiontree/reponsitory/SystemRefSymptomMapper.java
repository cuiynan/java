package com.aidoctor.decisiontree.reponsitory;

import com.aidoctor.decisiontree.entity.SystemRefSymptom;
import com.aidoctor.decisiontree.entity.SystemRefSymptomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemRefSymptomMapper {
    int countByExample(SystemRefSymptomExample example);

    int deleteByExample(SystemRefSymptomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemRefSymptom record);

    int insertSelective(SystemRefSymptom record);

    List<SystemRefSymptom> selectByExample(SystemRefSymptomExample example);

    SystemRefSymptom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemRefSymptom record, @Param("example") SystemRefSymptomExample example);

    int updateByExample(@Param("record") SystemRefSymptom record, @Param("example") SystemRefSymptomExample example);

    int updateByPrimaryKeySelective(SystemRefSymptom record);

    int updateByPrimaryKey(SystemRefSymptom record);
}