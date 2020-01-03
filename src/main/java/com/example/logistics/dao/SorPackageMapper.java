package com.example.logistics.dao;

import com.example.logistics.model.SorPackage;
import com.example.logistics.model.SorPackageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SorPackageMapper {
    int countByExample(SorPackageExample example);

    int deleteByExample(SorPackageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SorPackage record);

    int insertSelective(SorPackage record);

    List<SorPackage> selectByExample(SorPackageExample example);

    SorPackage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SorPackage record, @Param("example") SorPackageExample example);

    int updateByExample(@Param("record") SorPackage record, @Param("example") SorPackageExample example);

    int updateByPrimaryKeySelective(SorPackage record);

    int updateByPrimaryKey(SorPackage record);
}