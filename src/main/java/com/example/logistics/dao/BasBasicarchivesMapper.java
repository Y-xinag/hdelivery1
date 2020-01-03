package com.example.logistics.dao;

import com.example.logistics.model.BasBasicarchives;
import com.example.logistics.model.BasBasicarchivesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasBasicarchivesMapper {
    int countByExample(BasBasicarchivesExample example);

    int deleteByExample(BasBasicarchivesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasBasicarchives record);

    int insertSelective(BasBasicarchives record);

    List<BasBasicarchives> selectByExample(BasBasicarchivesExample example);

    BasBasicarchives selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasBasicarchives record, @Param("example") BasBasicarchivesExample example);

    int updateByExample(@Param("record") BasBasicarchives record, @Param("example") BasBasicarchivesExample example);

    int updateByPrimaryKeySelective(BasBasicarchives record);

    int updateByPrimaryKey(BasBasicarchives record);
}