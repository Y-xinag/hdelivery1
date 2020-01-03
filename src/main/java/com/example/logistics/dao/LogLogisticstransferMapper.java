package com.example.logistics.dao;

import com.example.logistics.model.LogLogisticstransfer;
import com.example.logistics.model.LogLogisticstransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogLogisticstransferMapper {
    int countByExample(LogLogisticstransferExample example);

    int deleteByExample(LogLogisticstransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LogLogisticstransfer record);

    int insertSelective(LogLogisticstransfer record);

    List<LogLogisticstransfer> selectByExample(LogLogisticstransferExample example);

    LogLogisticstransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LogLogisticstransfer record, @Param("example") LogLogisticstransferExample example);

    int updateByExample(@Param("record") LogLogisticstransfer record, @Param("example") LogLogisticstransferExample example);

    int updateByPrimaryKeySelective(LogLogisticstransfer record);

    int updateByPrimaryKey(LogLogisticstransfer record);
}