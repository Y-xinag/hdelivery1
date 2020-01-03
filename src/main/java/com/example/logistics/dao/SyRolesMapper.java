package com.example.logistics.dao;

import com.example.logistics.model.SyRoles;
import com.example.logistics.model.SyRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyRolesMapper {
    int countByExample(SyRolesExample example);

    int deleteByExample(SyRolesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SyRoles record);

    int insertSelective(SyRoles record);

    List<SyRoles> selectByExample(SyRolesExample example);

    SyRoles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SyRoles record, @Param("example") SyRolesExample example);

    int updateByExample(@Param("record") SyRoles record, @Param("example") SyRolesExample example);

    int updateByPrimaryKeySelective(SyRoles record);

    int updateByPrimaryKey(SyRoles record);
}