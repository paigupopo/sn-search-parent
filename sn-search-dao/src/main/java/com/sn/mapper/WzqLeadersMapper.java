package com.sn.mapper;

import com.sn.pojo.WzqLeaders;
import com.sn.pojo.WzqLeadersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WzqLeadersMapper {
    long countByExample(WzqLeadersExample example);

    int deleteByExample(WzqLeadersExample example);

    int deleteByPrimaryKey(Long leadersid);

    int insert(WzqLeaders record);

    int insertSelective(WzqLeaders record);

    List<WzqLeaders> selectByExample(WzqLeadersExample example);

    WzqLeaders selectByPrimaryKey(Long leadersid);

    int updateByExampleSelective(@Param("record") WzqLeaders record, @Param("example") WzqLeadersExample example);

    int updateByExample(@Param("record") WzqLeaders record, @Param("example") WzqLeadersExample example);

    int updateByPrimaryKeySelective(WzqLeaders record);

    int updateByPrimaryKey(WzqLeaders record);
}