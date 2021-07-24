package com.sn.mapper;

import com.sn.pojo.Leader;
import com.sn.pojo.LeaderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LeaderMapper {
    long countByExample(LeaderExample example);

    int deleteByExample(LeaderExample example);

    int deleteByPrimaryKey(Long qalId);

    int insert(Leader record);

    int insertSelective(Leader record);

    List<Leader> selectByExample(LeaderExample example);

    Leader selectByPrimaryKey(Long qalId);

    int updateByExampleSelective(@Param("record") Leader record, @Param("example") LeaderExample example);

    int updateByExample(@Param("record") Leader record, @Param("example") LeaderExample example);

    int updateByPrimaryKeySelective(Leader record);

    int updateByPrimaryKey(Leader record);
}