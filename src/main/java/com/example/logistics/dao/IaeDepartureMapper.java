package com.example.logistics.dao;

import com.example.logistics.model.IaeDeparture;
import com.example.logistics.model.IaeDepartureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IaeDepartureMapper {
    int countByExample(IaeDepartureExample example);

    int deleteByExample(IaeDepartureExample example);

    int deleteByPrimaryKey(String id);

    int insert(IaeDeparture record);

    int insertSelective(IaeDeparture record);

    List<IaeDeparture> selectByExample(IaeDepartureExample example);

    IaeDeparture selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") IaeDeparture record, @Param("example") IaeDepartureExample example);

    int updateByExample(@Param("record") IaeDeparture record, @Param("example") IaeDepartureExample example);

    int updateByPrimaryKeySelective(IaeDeparture record);

    int updateByPrimaryKey(IaeDeparture record);
}