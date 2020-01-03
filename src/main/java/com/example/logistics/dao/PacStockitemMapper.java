package com.example.logistics.dao;

import com.example.logistics.model.PacStockitem;
import com.example.logistics.model.PacStockitemExample;
import com.example.logistics.model.PacStockitemKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PacStockitemMapper {
    int countByExample(PacStockitemExample example);

    int deleteByExample(PacStockitemExample example);

    int deleteByPrimaryKey(PacStockitemKey key);

    int insert(PacStockitem record);

    int insertSelective(PacStockitem record);

    List<PacStockitem> selectByExample(PacStockitemExample example);

    PacStockitem selectByPrimaryKey(PacStockitemKey key);

    int updateByExampleSelective(@Param("record") PacStockitem record, @Param("example") PacStockitemExample example);

    int updateByExample(@Param("record") PacStockitem record, @Param("example") PacStockitemExample example);

    int updateByPrimaryKeySelective(PacStockitem record);

    int updateByPrimaryKey(PacStockitem record);
}