package com.sn.mapper;

import com.sn.pojo.HwadeePolls;
import com.sn.pojo.HwadeePollsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HwadeePollsMapper {
    long countByExample(HwadeePollsExample example);

    int deleteByExample(HwadeePollsExample example);

    int deleteByPrimaryKey(Long pollsid);

    int insert(HwadeePolls record);

    int insertSelective(HwadeePolls record);

    List<HwadeePolls> selectByExample(HwadeePollsExample example);

    HwadeePolls selectByPrimaryKey(Long pollsid);

    int updateByExampleSelective(@Param("record") HwadeePolls record, @Param("example") HwadeePollsExample example);

    int updateByExample(@Param("record") HwadeePolls record, @Param("example") HwadeePollsExample example);

    int updateByPrimaryKeySelective(HwadeePolls record);

    int updateByPrimaryKey(HwadeePolls record);
    List selectHpList();
}