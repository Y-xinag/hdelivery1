package com.example.logistics.dao;

import com.example.logistics.model.BasPartition;
import com.example.logistics.model.BasPartitionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasPartitionMapper {
    int countByExample(BasPartitionExample example);

    int deleteByExample(BasPartitionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasPartition record);

    int insertSelective(BasPartition record);

    List<BasPartition> selectByExample(BasPartitionExample example);

    BasPartition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasPartition record, @Param("example") BasPartitionExample example);

    int updateByExample(@Param("record") BasPartition record, @Param("example") BasPartitionExample example);

    int updateByPrimaryKeySelective(BasPartition record);

    int updateByPrimaryKey(BasPartition record);
}