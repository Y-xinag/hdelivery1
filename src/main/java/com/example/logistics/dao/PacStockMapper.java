package com.example.logistics.dao;

import com.example.logistics.model.PacStock;
import com.example.logistics.model.PacStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PacStockMapper {
    int countByExample(PacStockExample example);

    int deleteByExample(PacStockExample example);

    int deleteByPrimaryKey(String warehouseno);

    int insert(PacStock record);

    int insertSelective(PacStock record);

    List<PacStock> selectByExample(PacStockExample example);

    PacStock selectByPrimaryKey(String warehouseno);

    int updateByExampleSelective(@Param("record") PacStock record, @Param("example") PacStockExample example);

    int updateByExample(@Param("record") PacStock record, @Param("example") PacStockExample example);

    int updateByPrimaryKeySelective(PacStock record);

    int updateByPrimaryKey(PacStock record);
}