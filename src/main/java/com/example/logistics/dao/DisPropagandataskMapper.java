package com.example.logistics.dao;

import com.example.logistics.model.DisPropagandatask;
import com.example.logistics.model.DisPropagandataskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisPropagandataskMapper {
    int countByExample(DisPropagandataskExample example);

    int deleteByExample(DisPropagandataskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DisPropagandatask record);

    int insertSelective(DisPropagandatask record);

    List<DisPropagandatask> selectByExample(DisPropagandataskExample example);

    DisPropagandatask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DisPropagandatask record, @Param("example") DisPropagandataskExample example);

    int updateByExample(@Param("record") DisPropagandatask record, @Param("example") DisPropagandataskExample example);

    int updateByPrimaryKeySelective(DisPropagandatask record);

    int updateByPrimaryKey(DisPropagandatask record);
}