package com.sn.mapper;


import com.sn.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JournalarticleMapper {
    long countByExample(JournalarticleExample example);

    int deleteByExample(JournalarticleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Journalarticle record);

    int insertSelective(Journalarticle record);

    List<Journalarticle> selectByExample(JournalarticleExample example);

    Journalarticle selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Journalarticle record, @Param("example") JournalarticleExample example);

    int updateByExample(@Param("record") Journalarticle record, @Param("example") JournalarticleExample example);

    int updateByPrimaryKeySelective(Journalarticle record);

    int updateByPrimaryKey(Journalarticle record);

    /**
     * 遂宁
     * @return
     */
    List selectCMSList(@Param("start") long start, @Param("groupId") long groupId);

    /**
     站点集合
     */
    List selectGroupList();
    /**
     * 当前站点总数
     */
    int selectCMSCount(@Param("groupId") long groupId);

    /**
     * 查询数据总数
     * @return
     */
    Long selectCount();









}