package com.example.logistics.dao;

import com.example.logistics.model.SorStoragedetails;
import com.example.logistics.model.SorStoragedetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SorStoragedetailsMapper {
    int countByExample(SorStoragedetailsExample example);

    int deleteByExample(SorStoragedetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SorStoragedetails record);

    int insertSelective(SorStoragedetails record);

    List<SorStoragedetails> selectByExample(SorStoragedetailsExample example);

    SorStoragedetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SorStoragedetails record, @Param("example") SorStoragedetailsExample example);

    int updateByExample(@Param("record") SorStoragedetails record, @Param("example") SorStoragedetailsExample example);

    int updateByPrimaryKeySelective(SorStoragedetails record);

    int updateByPrimaryKey(SorStoragedetails record);
}