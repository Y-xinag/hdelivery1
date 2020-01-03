package com.example.logistics.dao;

import com.example.logistics.model.BiglogLogisticscontroltable;
import com.example.logistics.model.BiglogLogisticscontroltableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BiglogLogisticscontroltableMapper {
    int countByExample(BiglogLogisticscontroltableExample example);

    int deleteByExample(BiglogLogisticscontroltableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BiglogLogisticscontroltable record);

    int insertSelective(BiglogLogisticscontroltable record);

    List<BiglogLogisticscontroltable> selectByExample(BiglogLogisticscontroltableExample example);

    BiglogLogisticscontroltable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BiglogLogisticscontroltable record, @Param("example") BiglogLogisticscontroltableExample example);

    int updateByExample(@Param("record") BiglogLogisticscontroltable record, @Param("example") BiglogLogisticscontroltableExample example);

    int updateByPrimaryKeySelective(BiglogLogisticscontroltable record);

    int updateByPrimaryKey(BiglogLogisticscontroltable record);
}