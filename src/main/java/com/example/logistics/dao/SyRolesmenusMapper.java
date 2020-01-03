package com.example.logistics.dao;

import com.example.logistics.model.SyRolesmenus;
import com.example.logistics.model.SyRolesmenusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyRolesmenusMapper {
    int countByExample(SyRolesmenusExample example);

    int deleteByExample(SyRolesmenusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SyRolesmenus record);

    int insertSelective(SyRolesmenus record);

    List<SyRolesmenus> selectByExample(SyRolesmenusExample example);

    SyRolesmenus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SyRolesmenus record, @Param("example") SyRolesmenusExample example);

    int updateByExample(@Param("record") SyRolesmenus record, @Param("example") SyRolesmenusExample example);

    int updateByPrimaryKeySelective(SyRolesmenus record);

    int updateByPrimaryKey(SyRolesmenus record);
}