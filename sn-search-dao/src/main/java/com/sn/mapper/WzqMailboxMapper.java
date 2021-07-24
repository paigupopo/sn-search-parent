package com.sn.mapper;

import com.sn.pojo.WzqMailbox;
import com.sn.pojo.WzqMailboxExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WzqMailboxMapper {
    long countByExample(WzqMailboxExample example);

    int deleteByExample(WzqMailboxExample example);

    int deleteByPrimaryKey(Long messageid);

    int insert(WzqMailbox record);

    int insertSelective(WzqMailbox record);


    List<WzqMailbox> selectByExample(WzqMailboxExample example);

    WzqMailbox selectByPrimaryKey(Long messageid);

    int updateByExampleSelective(@Param("record") WzqMailbox record, @Param("example") WzqMailboxExample example);


    int updateByExample(@Param("record") WzqMailbox record, @Param("example") WzqMailboxExample example);

    int updateByPrimaryKeySelective(WzqMailbox record);


    int updateByPrimaryKey(WzqMailbox record);
    List <WzqMailbox> selectWOX();
}