package com.aidoctor.reponsitory;

import com.aidoctor.reponsitory.OutStore;
import com.aidoctor.reponsitory.OutStoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutStoreMapper {
    int countByExample(OutStoreExample example);

    int deleteByExample(OutStoreExample example);

    int deleteByPrimaryKey(String id);

    int insert(OutStore record);

    int insertSelective(OutStore record);

    List<OutStore> selectByExampleWithBLOBs(OutStoreExample example);

    List<OutStore> selectByExample(OutStoreExample example);

    OutStore selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OutStore record, @Param("example") OutStoreExample example);

    int updateByExampleWithBLOBs(@Param("record") OutStore record, @Param("example") OutStoreExample example);

    int updateByExample(@Param("record") OutStore record, @Param("example") OutStoreExample example);

    int updateByPrimaryKeySelective(OutStore record);

    int updateByPrimaryKeyWithBLOBs(OutStore record);

    int updateByPrimaryKey(OutStore record);
}