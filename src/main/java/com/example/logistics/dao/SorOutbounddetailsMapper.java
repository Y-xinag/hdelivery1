package com.example.logistics.dao;

import com.example.logistics.model.SorOutbounddetails;
import com.example.logistics.model.SorOutbounddetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SorOutbounddetailsMapper {
    int countByExample(SorOutbounddetailsExample example);

    int deleteByExample(SorOutbounddetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SorOutbounddetails record);

    int insertSelective(SorOutbounddetails record);

    List<SorOutbounddetails> selectByExample(SorOutbounddetailsExample example);

    SorOutbounddetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SorOutbounddetails record, @Param("example") SorOutbounddetailsExample example);

    int updateByExample(@Param("record") SorOutbounddetails record, @Param("example") SorOutbounddetailsExample example);

    int updateByPrimaryKeySelective(SorOutbounddetails record);

    int updateByPrimaryKey(SorOutbounddetails record);
}