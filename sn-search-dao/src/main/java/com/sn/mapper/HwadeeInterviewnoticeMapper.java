package com.sn.mapper;

import com.sn.pojo.HwadeeInterviewnotice;
import com.sn.pojo.HwadeeInterviewnoticeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HwadeeInterviewnoticeMapper {
    long countByExample(HwadeeInterviewnoticeExample example);

    int deleteByExample(HwadeeInterviewnoticeExample example);

    int deleteByPrimaryKey(Long noticeid);

    int insert(HwadeeInterviewnotice record);

    int insertSelective(HwadeeInterviewnotice record);

    List<HwadeeInterviewnotice> selectByExample(HwadeeInterviewnoticeExample example);

    HwadeeInterviewnotice selectByPrimaryKey(Long noticeid);

    int updateByExampleSelective(@Param("record") HwadeeInterviewnotice record, @Param("example") HwadeeInterviewnoticeExample example);

    int updateByExample(@Param("record") HwadeeInterviewnotice record, @Param("example") HwadeeInterviewnoticeExample example);

    int updateByPrimaryKeySelective(HwadeeInterviewnotice record);

    int updateByPrimaryKey(HwadeeInterviewnotice record);

    List<HwadeeInterviewnotice> selectIN();


}