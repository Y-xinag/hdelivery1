package com.example.logistics.dao;

import com.example.logistics.model.SorAbnormal;
import com.example.logistics.model.SorAbnormalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SorAbnormalMapper {
    int countByExample(SorAbnormalExample example);

    int deleteByExample(SorAbnormalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SorAbnormal record);

    int insertSelective(SorAbnormal record);

    List<SorAbnormal> selectByExample(SorAbnormalExample example);

    SorAbnormal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SorAbnormal record, @Param("example") SorAbnormalExample example);

    int updateByExample(@Param("record") SorAbnormal record, @Param("example") SorAbnormalExample example);

    int updateByPrimaryKeySelective(SorAbnormal record);

    int updateByPrimaryKey(SorAbnormal record);
}