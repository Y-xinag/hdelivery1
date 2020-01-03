package com.example.logistics.dao;

import com.example.logistics.model.SorPackagedetails;
import com.example.logistics.model.SorPackagedetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SorPackagedetailsMapper {
    int countByExample(SorPackagedetailsExample example);

    int deleteByExample(SorPackagedetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SorPackagedetails record);

    int insertSelective(SorPackagedetails record);

    List<SorPackagedetails> selectByExample(SorPackagedetailsExample example);

    SorPackagedetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SorPackagedetails record, @Param("example") SorPackagedetailsExample example);

    int updateByExample(@Param("record") SorPackagedetails record, @Param("example") SorPackagedetailsExample example);

    int updateByPrimaryKeySelective(SorPackagedetails record);

    int updateByPrimaryKey(SorPackagedetails record);
}