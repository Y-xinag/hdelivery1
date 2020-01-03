package com.example.logistics.dao;

import com.example.logistics.model.BasShuttlebus;
import com.example.logistics.model.BasShuttlebusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasShuttlebusMapper {
    int countByExample(BasShuttlebusExample example);

    int deleteByExample(BasShuttlebusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasShuttlebus record);

    int insertSelective(BasShuttlebus record);

    List<BasShuttlebus> selectByExample(BasShuttlebusExample example);

    BasShuttlebus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasShuttlebus record, @Param("example") BasShuttlebusExample example);

    int updateByExample(@Param("record") BasShuttlebus record, @Param("example") BasShuttlebusExample example);

    int updateByPrimaryKeySelective(BasShuttlebus record);

    int updateByPrimaryKey(BasShuttlebus record);
}