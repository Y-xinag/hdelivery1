package com.example.logistics.dao;

import com.example.logistics.model.SorCheckbound;
import com.example.logistics.model.SorCheckboundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SorCheckboundMapper {
    int countByExample(SorCheckboundExample example);

    int deleteByExample(SorCheckboundExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SorCheckbound record);

    int insertSelective(SorCheckbound record);

    List<SorCheckbound> selectByExample(SorCheckboundExample example);

    SorCheckbound selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SorCheckbound record, @Param("example") SorCheckboundExample example);

    int updateByExample(@Param("record") SorCheckbound record, @Param("example") SorCheckboundExample example);

    int updateByPrimaryKeySelective(SorCheckbound record);

    int updateByPrimaryKey(SorCheckbound record);
}