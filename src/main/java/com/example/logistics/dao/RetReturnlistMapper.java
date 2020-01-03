package com.example.logistics.dao;

import com.example.logistics.model.RetReturnlist;
import com.example.logistics.model.RetReturnlistExample;
import com.example.logistics.model.RetReturnlistKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RetReturnlistMapper {
    int countByExample(RetReturnlistExample example);

    int deleteByExample(RetReturnlistExample example);

    int deleteByPrimaryKey(RetReturnlistKey key);

    int insert(RetReturnlist record);

    int insertSelective(RetReturnlist record);

    List<RetReturnlist> selectByExample(RetReturnlistExample example);

    RetReturnlist selectByPrimaryKey(RetReturnlistKey key);

    int updateByExampleSelective(@Param("record") RetReturnlist record, @Param("example") RetReturnlistExample example);

    int updateByExample(@Param("record") RetReturnlist record, @Param("example") RetReturnlistExample example);

    int updateByPrimaryKeySelective(RetReturnlist record);

    int updateByPrimaryKey(RetReturnlist record);
}