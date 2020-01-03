package com.example.logistics.dao;

import com.example.logistics.model.DisWorkordersign;
import com.example.logistics.model.DisWorkordersignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisWorkordersignMapper {
    int countByExample(DisWorkordersignExample example);

    int deleteByExample(DisWorkordersignExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DisWorkordersign record);

    int insertSelective(DisWorkordersign record);

    List<DisWorkordersign> selectByExample(DisWorkordersignExample example);

    DisWorkordersign selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DisWorkordersign record, @Param("example") DisWorkordersignExample example);

    int updateByExample(@Param("record") DisWorkordersign record, @Param("example") DisWorkordersignExample example);

    int updateByPrimaryKeySelective(DisWorkordersign record);

    int updateByPrimaryKey(DisWorkordersign record);
}