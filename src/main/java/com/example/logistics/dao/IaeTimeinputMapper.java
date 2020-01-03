package com.example.logistics.dao;

import com.example.logistics.model.IaeTimeinput;
import com.example.logistics.model.IaeTimeinputExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IaeTimeinputMapper {
    int countByExample(IaeTimeinputExample example);

    int deleteByExample(IaeTimeinputExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IaeTimeinput record);

    int insertSelective(IaeTimeinput record);

    List<IaeTimeinput> selectByExample(IaeTimeinputExample example);

    IaeTimeinput selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IaeTimeinput record, @Param("example") IaeTimeinputExample example);

    int updateByExample(@Param("record") IaeTimeinput record, @Param("example") IaeTimeinputExample example);

    int updateByPrimaryKeySelective(IaeTimeinput record);

    int updateByPrimaryKey(IaeTimeinput record);
}