package com.example.logistics.dao;

import com.example.logistics.model.BasZoneinfo;
import com.example.logistics.model.BasZoneinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasZoneinfoMapper {
    int countByExample(BasZoneinfoExample example);

    int deleteByExample(BasZoneinfoExample example);

    int deleteByPrimaryKey(String zonename);

    int insert(BasZoneinfo record);

    int insertSelective(BasZoneinfo record);

    List<BasZoneinfo> selectByExample(BasZoneinfoExample example);

    BasZoneinfo selectByPrimaryKey(String zonename);

    int updateByExampleSelective(@Param("record") BasZoneinfo record, @Param("example") BasZoneinfoExample example);

    int updateByExample(@Param("record") BasZoneinfo record, @Param("example") BasZoneinfoExample example);

    int updateByPrimaryKeySelective(BasZoneinfo record);

    int updateByPrimaryKey(BasZoneinfo record);
}