package com.example.logistics.dao;

import com.example.logistics.model.DisDispatchhistory;
import com.example.logistics.model.DisDispatchhistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisDispatchhistoryMapper {
    int countByExample(DisDispatchhistoryExample example);

    int deleteByExample(DisDispatchhistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DisDispatchhistory record);

    int insertSelective(DisDispatchhistory record);

    List<DisDispatchhistory> selectByExample(DisDispatchhistoryExample example);

    DisDispatchhistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DisDispatchhistory record, @Param("example") DisDispatchhistoryExample example);

    int updateByExample(@Param("record") DisDispatchhistory record, @Param("example") DisDispatchhistoryExample example);

    int updateByPrimaryKeySelective(DisDispatchhistory record);

    int updateByPrimaryKey(DisDispatchhistory record);
}