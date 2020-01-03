package com.example.logistics.dao;

import com.example.logistics.model.BasStandartime;
import com.example.logistics.model.BasStandartimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasStandartimeMapper {
    int countByExample(BasStandartimeExample example);

    int deleteByExample(BasStandartimeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasStandartime record);

    int insertSelective(BasStandartime record);

    List<BasStandartime> selectByExample(BasStandartimeExample example);

    BasStandartime selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasStandartime record, @Param("example") BasStandartimeExample example);

    int updateByExample(@Param("record") BasStandartime record, @Param("example") BasStandartimeExample example);

    int updateByPrimaryKeySelective(BasStandartime record);

    int updateByPrimaryKey(BasStandartime record);
}