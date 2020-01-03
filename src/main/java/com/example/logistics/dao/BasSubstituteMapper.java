package com.example.logistics.dao;

import com.example.logistics.model.BasSubstitute;
import com.example.logistics.model.BasSubstituteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasSubstituteMapper {
    int countByExample(BasSubstituteExample example);

    int deleteByExample(BasSubstituteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasSubstitute record);

    int insertSelective(BasSubstitute record);

    List<BasSubstitute> selectByExample(BasSubstituteExample example);

    BasSubstitute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasSubstitute record, @Param("example") BasSubstituteExample example);

    int updateByExample(@Param("record") BasSubstitute record, @Param("example") BasSubstituteExample example);

    int updateByPrimaryKeySelective(BasSubstitute record);

    int updateByPrimaryKey(BasSubstitute record);
}