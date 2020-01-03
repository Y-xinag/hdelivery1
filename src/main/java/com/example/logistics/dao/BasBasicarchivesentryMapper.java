package com.example.logistics.dao;

import com.example.logistics.model.BasBasicarchivesentry;
import com.example.logistics.model.BasBasicarchivesentryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasBasicarchivesentryMapper {
    int countByExample(BasBasicarchivesentryExample example);

    int deleteByExample(BasBasicarchivesentryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasBasicarchivesentry record);

    int insertSelective(BasBasicarchivesentry record);

    List<BasBasicarchivesentry> selectByExample(BasBasicarchivesentryExample example);

    BasBasicarchivesentry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasBasicarchivesentry record, @Param("example") BasBasicarchivesentryExample example);

    int updateByExample(@Param("record") BasBasicarchivesentry record, @Param("example") BasBasicarchivesentryExample example);

    int updateByPrimaryKeySelective(BasBasicarchivesentry record);

    int updateByPrimaryKey(BasBasicarchivesentry record);
}