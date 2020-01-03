package com.example.logistics.dao;

import com.example.logistics.model.IaeLineresource;
import com.example.logistics.model.IaeLineresourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IaeLineresourceMapper {
    int countByExample(IaeLineresourceExample example);

    int deleteByExample(IaeLineresourceExample example);

    int deleteByPrimaryKey(String id);

    int insert(IaeLineresource record);

    int insertSelective(IaeLineresource record);

    List<IaeLineresource> selectByExample(IaeLineresourceExample example);

    IaeLineresource selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") IaeLineresource record, @Param("example") IaeLineresourceExample example);

    int updateByExample(@Param("record") IaeLineresource record, @Param("example") IaeLineresourceExample example);

    int updateByPrimaryKeySelective(IaeLineresource record);

    int updateByPrimaryKey(IaeLineresource record);
}