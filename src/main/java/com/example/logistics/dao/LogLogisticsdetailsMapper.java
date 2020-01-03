package com.example.logistics.dao;

import com.example.logistics.model.LogLogisticsdetails;
import com.example.logistics.model.LogLogisticsdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogLogisticsdetailsMapper {
    int countByExample(LogLogisticsdetailsExample example);

    int deleteByExample(LogLogisticsdetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LogLogisticsdetails record);

    int insertSelective(LogLogisticsdetails record);

    List<LogLogisticsdetails> selectByExample(LogLogisticsdetailsExample example);

    LogLogisticsdetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LogLogisticsdetails record, @Param("example") LogLogisticsdetailsExample example);

    int updateByExample(@Param("record") LogLogisticsdetails record, @Param("example") LogLogisticsdetailsExample example);

    int updateByPrimaryKeySelective(LogLogisticsdetails record);

    int updateByPrimaryKey(LogLogisticsdetails record);
}