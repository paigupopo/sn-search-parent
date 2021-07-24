package com.sn.mapper;

import com.sn.pojo.HwadeeSuggest;
import com.sn.pojo.HwadeeSuggestExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HwadeeSuggestMapper {
    long countByExample(HwadeeSuggestExample example);

    int deleteByExample(HwadeeSuggestExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HwadeeSuggest record);

    int insertSelective(HwadeeSuggest record);

    List<HwadeeSuggest> selectByExample(HwadeeSuggestExample example);

    HwadeeSuggest selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HwadeeSuggest record, @Param("example") HwadeeSuggestExample example);

    int updateByExample(@Param("record") HwadeeSuggest record, @Param("example") HwadeeSuggestExample example);

    int updateByPrimaryKeySelective(HwadeeSuggest record);

    int updateByPrimaryKey(HwadeeSuggest record);

    List selectHSList();
}