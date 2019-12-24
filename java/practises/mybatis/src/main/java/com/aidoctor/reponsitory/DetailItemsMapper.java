package com.aidoctor.reponsitory;

import com.aidoctor.entity.DetailItems;
import com.aidoctor.entity.DetailItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DetailItemsMapper {
    int countByExample(DetailItemsExample example);

    int deleteByExample(DetailItemsExample example);

    int deleteByPrimaryKey(String id);

    int insert(DetailItems record);

    int insertSelective(DetailItems record);

    List<DetailItems> selectByExample(DetailItemsExample example);

    DetailItems selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DetailItems record, @Param("example") DetailItemsExample example);

    int updateByExample(@Param("record") DetailItems record, @Param("example") DetailItemsExample example);

    int updateByPrimaryKeySelective(DetailItems record);

    int updateByPrimaryKey(DetailItems record);
}