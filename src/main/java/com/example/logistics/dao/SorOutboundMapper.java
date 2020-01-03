package com.example.logistics.dao;

import com.example.logistics.model.SorOutbound;
import com.example.logistics.model.SorOutboundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SorOutboundMapper {
    int countByExample(SorOutboundExample example);

    int deleteByExample(SorOutboundExample example);

    int deleteByPrimaryKey(String outboundid);

    int insert(SorOutbound record);

    int insertSelective(SorOutbound record);

    List<SorOutbound> selectByExample(SorOutboundExample example);

    SorOutbound selectByPrimaryKey(String outboundid);

    int updateByExampleSelective(@Param("record") SorOutbound record, @Param("example") SorOutboundExample example);

    int updateByExample(@Param("record") SorOutbound record, @Param("example") SorOutboundExample example);

    int updateByPrimaryKeySelective(SorOutbound record);

    int updateByPrimaryKey(SorOutbound record);
}