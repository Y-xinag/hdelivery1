package com.example.logistics.dao;

import com.example.logistics.model.SorStorage;
import com.example.logistics.model.SorStorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SorStorageMapper {
    int countByExample(SorStorageExample example);

    int deleteByExample(SorStorageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SorStorage record);

    int insertSelective(SorStorage record);

    List<SorStorage> selectByExample(SorStorageExample example);

    SorStorage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SorStorage record, @Param("example") SorStorageExample example);

    int updateByExample(@Param("record") SorStorage record, @Param("example") SorStorageExample example);

    int updateByPrimaryKeySelective(SorStorage record);

    int updateByPrimaryKey(SorStorage record);
}