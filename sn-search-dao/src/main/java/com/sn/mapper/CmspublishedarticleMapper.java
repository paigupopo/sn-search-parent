package com.sn.mapper;

import com.sn.pojo.Cmspublishedarticle;
import com.sn.pojo.CmspublishedarticleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmspublishedarticleMapper {
    long countByExample(CmspublishedarticleExample example);

    int deleteByExample(CmspublishedarticleExample example);

    int deleteByPrimaryKey(Long resourceprimkey);

    int insert(Cmspublishedarticle record);

    int insertSelective(Cmspublishedarticle record);

    List<Cmspublishedarticle> selectByExample(CmspublishedarticleExample example);

    Cmspublishedarticle selectByPrimaryKey(Long resourceprimkey);

    int updateByExampleSelective(@Param("record") Cmspublishedarticle record, @Param("example") CmspublishedarticleExample example);

    int updateByExample(@Param("record") Cmspublishedarticle record, @Param("example") CmspublishedarticleExample example);

    int updateByPrimaryKeySelective(Cmspublishedarticle record);

    int updateByPrimaryKey(Cmspublishedarticle record);

    List<Cmspublishedarticle>selectJOSList(@Param("start") long start, @Param("groupId") long groupId);

    List<String> getCategoryName(String cateGoryFlag);
}