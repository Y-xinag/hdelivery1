package com.example.logistics.dao;

import com.example.logistics.model.SorCheckbounddetails;
import com.example.logistics.model.SorCheckbounddetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SorCheckbounddetailsMapper {
    int countByExample(SorCheckbounddetailsExample example);

    int deleteByExample(SorCheckbounddetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SorCheckbounddetails record);

    int insertSelective(SorCheckbounddetails record);

    List<SorCheckbounddetails> selectByExample(SorCheckbounddetailsExample example);

    SorCheckbounddetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SorCheckbounddetails record, @Param("example") SorCheckbounddetailsExample example);

    int updateByExample(@Param("record") SorCheckbounddetails record, @Param("example") SorCheckbounddetailsExample example);

    int updateByPrimaryKeySelective(SorCheckbounddetails record);

    int updateByPrimaryKey(SorCheckbounddetails record);
}