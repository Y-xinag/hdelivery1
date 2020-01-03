package com.example.logistics.dao;

import com.example.logistics.model.BasZonecustominfo;
import com.example.logistics.model.BasZonecustominfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasZonecustominfoMapper {
    int countByExample(BasZonecustominfoExample example);

    int deleteByExample(BasZonecustominfoExample example);

    int deleteByPrimaryKey(Integer customcode);

    int insert(BasZonecustominfo record);

    int insertSelective(BasZonecustominfo record);

    List<BasZonecustominfo> selectByExample(BasZonecustominfoExample example);

    BasZonecustominfo selectByPrimaryKey(Integer customcode);

    int updateByExampleSelective(@Param("record") BasZonecustominfo record, @Param("example") BasZonecustominfoExample example);

    int updateByExample(@Param("record") BasZonecustominfo record, @Param("example") BasZonecustominfoExample example);

    int updateByPrimaryKeySelective(BasZonecustominfo record);

    int updateByPrimaryKey(BasZonecustominfo record);
}