package com.example.logistics.dao;

import com.example.logistics.model.IaeArrival;
import com.example.logistics.model.IaeArrivalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IaeArrivalMapper {
    int countByExample(IaeArrivalExample example);

    int deleteByExample(IaeArrivalExample example);

    int deleteByPrimaryKey(String id);

    int insert(IaeArrival record);

    int insertSelective(IaeArrival record);

    List<IaeArrival> selectByExample(IaeArrivalExample example);

    IaeArrival selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") IaeArrival record, @Param("example") IaeArrivalExample example);

    int updateByExample(@Param("record") IaeArrival record, @Param("example") IaeArrivalExample example);

    int updateByPrimaryKeySelective(IaeArrival record);

    int updateByPrimaryKey(IaeArrival record);
}