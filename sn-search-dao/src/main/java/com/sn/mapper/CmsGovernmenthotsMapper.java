package com.sn.mapper;

import com.sn.pojo.CmsGovernmenthots;
import com.sn.pojo.CmsGovernmenthotsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsGovernmenthotsMapper {
    long countByExample(CmsGovernmenthotsExample example);

    int deleteByExample(CmsGovernmenthotsExample example);

    int deleteByPrimaryKey(Long govhotid);

    int insert(CmsGovernmenthots record);

    int insertSelective(CmsGovernmenthots record);

    List<CmsGovernmenthots> selectByExample(CmsGovernmenthotsExample example);

    CmsGovernmenthots selectByPrimaryKey(Long govhotid);

    int updateByExampleSelective(@Param("record") CmsGovernmenthots record, @Param("example") CmsGovernmenthotsExample example);

    int updateByExample(@Param("record") CmsGovernmenthots record, @Param("example") CmsGovernmenthotsExample example);

    int updateByPrimaryKeySelective(CmsGovernmenthots record);

    int updateByPrimaryKey(CmsGovernmenthots record);

    long selectGovHotId(String govhotName);

    List selectName();

    /**
     * 获取热词记录
     * @param aLong
     * @return
     */
    List GovHotName(Object aLong);

}