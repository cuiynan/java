package com.aidoctor.decisiontree.reponsitory;

import com.aidoctor.decisiontree.entity.GastroenteroloyMatrix;
import com.aidoctor.decisiontree.entity.GastroenteroloyMatrixExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GastroenteroloyMatrixMapper {
    int countByExample(GastroenteroloyMatrixExample example);

    int deleteByExample(GastroenteroloyMatrixExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GastroenteroloyMatrix record);

    int insertSelective(GastroenteroloyMatrix record);

    List<GastroenteroloyMatrix> selectByExample(GastroenteroloyMatrixExample example);

    GastroenteroloyMatrix selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GastroenteroloyMatrix record, @Param("example") GastroenteroloyMatrixExample example);

    int updateByExample(@Param("record") GastroenteroloyMatrix record, @Param("example") GastroenteroloyMatrixExample example);

    int updateByPrimaryKeySelective(GastroenteroloyMatrix record);

    int updateByPrimaryKey(GastroenteroloyMatrix record);
}