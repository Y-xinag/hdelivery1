package com.example.logistics.dao;

import com.example.logistics.model.LogLogistics;
import com.example.logistics.model.LogLogisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogLogisticsMapper {
    int countByExample(LogLogisticsExample example);

    int deleteByExample(LogLogisticsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LogLogistics record);

    int insertSelective(LogLogistics record);

    List<LogLogistics> selectByExample(LogLogisticsExample example);

    LogLogistics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LogLogistics record, @Param("example") LogLogisticsExample example);

    int updateByExample(@Param("record") LogLogistics record, @Param("example") LogLogisticsExample example);

    int updateByPrimaryKeySelective(LogLogistics record);

    int updateByPrimaryKey(LogLogistics record);
}