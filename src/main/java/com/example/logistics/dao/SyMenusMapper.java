package com.example.logistics.dao;

import com.example.logistics.model.SyMenus;
import com.example.logistics.model.SyMenusExample;
import com.example.logistics.model.SyMenusWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyMenusMapper {
    int countByExample(SyMenusExample example);

    int deleteByExample(SyMenusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SyMenusWithBLOBs record);

    int insertSelective(SyMenusWithBLOBs record);

    List<SyMenusWithBLOBs> selectByExampleWithBLOBs(SyMenusExample example);

    List<SyMenus> selectByExample(SyMenusExample example);

    SyMenusWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SyMenusWithBLOBs record, @Param("example") SyMenusExample example);

    int updateByExampleWithBLOBs(@Param("record") SyMenusWithBLOBs record, @Param("example") SyMenusExample example);

    int updateByExample(@Param("record") SyMenus record, @Param("example") SyMenusExample example);

    int updateByPrimaryKeySelective(SyMenusWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SyMenusWithBLOBs record);

    int updateByPrimaryKey(SyMenus record);
}