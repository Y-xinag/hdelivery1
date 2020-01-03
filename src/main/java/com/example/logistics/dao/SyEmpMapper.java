package com.example.logistics.dao;

import com.example.logistics.model.SyEmp;
import com.example.logistics.model.SyEmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyEmpMapper {
    int countByExample(SyEmpExample example);

    int deleteByExample(SyEmpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SyEmp record);

    int insertSelective(SyEmp record);

    List<SyEmp> selectByExample(SyEmpExample example);

    SyEmp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SyEmp record, @Param("example") SyEmpExample example);

    int updateByExample(@Param("record") SyEmp record, @Param("example") SyEmpExample example);

    int updateByPrimaryKeySelective(SyEmp record);

    int updateByPrimaryKey(SyEmp record);
}