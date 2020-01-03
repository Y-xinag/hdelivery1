package com.example.logistics.dao;

import com.example.logistics.model.SyUnits;
import com.example.logistics.model.SyUnitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyUnitsMapper {
    int countByExample(SyUnitsExample example);

    int deleteByExample(SyUnitsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SyUnits record);

    int insertSelective(SyUnits record);

    List<SyUnits> selectByExample(SyUnitsExample example);

    SyUnits selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SyUnits record, @Param("example") SyUnitsExample example);

    int updateByExample(@Param("record") SyUnits record, @Param("example") SyUnitsExample example);

    int updateByPrimaryKeySelective(SyUnits record);

    int updateByPrimaryKey(SyUnits record);
}