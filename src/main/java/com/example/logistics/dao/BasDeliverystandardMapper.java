package com.example.logistics.dao;

import com.example.logistics.model.BasDeliverystandard;
import com.example.logistics.model.BasDeliverystandardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasDeliverystandardMapper {
    int countByExample(BasDeliverystandardExample example);

    int deleteByExample(BasDeliverystandardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasDeliverystandard record);

    int insertSelective(BasDeliverystandard record);

    List<BasDeliverystandard> selectByExample(BasDeliverystandardExample example);

    BasDeliverystandard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasDeliverystandard record, @Param("example") BasDeliverystandardExample example);

    int updateByExample(@Param("record") BasDeliverystandard record, @Param("example") BasDeliverystandardExample example);

    int updateByPrimaryKeySelective(BasDeliverystandard record);

    int updateByPrimaryKey(BasDeliverystandard record);
}