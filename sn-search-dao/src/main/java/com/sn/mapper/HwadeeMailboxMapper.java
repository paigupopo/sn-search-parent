package com.sn.mapper;

import com.sn.pojo.HwadeeMailbox;
import com.sn.pojo.HwadeeMailboxExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HwadeeMailboxMapper {
    long countByExample(HwadeeMailboxExample example);

    int deleteByExample(HwadeeMailboxExample example);

    int deleteByPrimaryKey(Long messageid);

    int insert(HwadeeMailbox record);

    int insertSelective(HwadeeMailbox record);

    List<HwadeeMailbox> selectByExample(HwadeeMailboxExample example);

    HwadeeMailbox selectByPrimaryKey(Long messageid);

    int updateByExampleSelective(@Param("record") HwadeeMailbox record, @Param("example") HwadeeMailboxExample example);

    int updateByExample(@Param("record") HwadeeMailbox record, @Param("example") HwadeeMailboxExample example);

    int updateByPrimaryKeySelective(HwadeeMailbox record);

    int updateByPrimaryKey(HwadeeMailbox record);

    List<HwadeeMailbox> selectMOX();

    /**
     * 根据id获取信箱数据
     * @param groupId
     * @return
     */
    List<HwadeeMailbox> selectMa(Long groupId);


}