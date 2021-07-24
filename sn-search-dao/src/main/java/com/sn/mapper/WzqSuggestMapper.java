package com.sn.mapper;

import com.sn.pojo.WzqSuggest;
import com.sn.pojo.WzqSuggestExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WzqSuggestMapper {
    long countByExample(WzqSuggestExample example);

    int deleteByExample(WzqSuggestExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WzqSuggest record);

    int insertSelective(WzqSuggest record);

    List<WzqSuggest> selectByExample(WzqSuggestExample example);

    WzqSuggest selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WzqSuggest record, @Param("example") WzqSuggestExample example);

    int updateByExample(@Param("record") WzqSuggest record, @Param("example") WzqSuggestExample example);

    int updateByPrimaryKeySelective(WzqSuggest record);

    int updateByPrimaryKey(WzqSuggest record);

    List<WzqSuggest> selectWSList();

}