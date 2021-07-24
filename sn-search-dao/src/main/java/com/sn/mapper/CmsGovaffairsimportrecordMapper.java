package com.sn.mapper;

import com.sn.pojo.CmsGovaffairsimportrecord;
import com.sn.pojo.CmsGovaffairsimportrecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsGovaffairsimportrecordMapper {
    long countByExample(CmsGovaffairsimportrecordExample example);

    int deleteByExample(CmsGovaffairsimportrecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsGovaffairsimportrecord record);

    int insertSelective(CmsGovaffairsimportrecord record);

    List<CmsGovaffairsimportrecord> selectByExample(CmsGovaffairsimportrecordExample example);

    CmsGovaffairsimportrecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsGovaffairsimportrecord record, @Param("example") CmsGovaffairsimportrecordExample example);

    int updateByExample(@Param("record") CmsGovaffairsimportrecord record, @Param("example") CmsGovaffairsimportrecordExample example);

    int updateByPrimaryKeySelective(CmsGovaffairsimportrecord record);

    int updateByPrimaryKey(CmsGovaffairsimportrecord record);

    List<CmsGovaffairsimportrecord> selectList();


}