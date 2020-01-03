package com.example.logistics.dao;

import com.example.logistics.model.LogTrack;
import com.example.logistics.model.LogTrackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogTrackMapper {
    int countByExample(LogTrackExample example);

    int deleteByExample(LogTrackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LogTrack record);

    int insertSelective(LogTrack record);

    List<LogTrack> selectByExample(LogTrackExample example);

    LogTrack selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LogTrack record, @Param("example") LogTrackExample example);

    int updateByExample(@Param("record") LogTrack record, @Param("example") LogTrackExample example);

    int updateByPrimaryKeySelective(LogTrack record);

    int updateByPrimaryKey(LogTrack record);
}