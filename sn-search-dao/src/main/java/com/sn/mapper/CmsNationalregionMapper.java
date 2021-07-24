package com.sn.mapper;

import com.sn.pojo.CmsNationalregion;
import com.sn.pojo.CmsNationalregionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsNationalregionMapper {
    long countByExample(CmsNationalregionExample example);

    int deleteByExample(CmsNationalregionExample example);

    int deleteByPrimaryKey(Integer regionid);

    int insert(CmsNationalregion record);

    int insertSelective(CmsNationalregion record);

    List<CmsNationalregion> selectByExample(CmsNationalregionExample example);

    CmsNationalregion selectByPrimaryKey(Integer regionid);

    int updateByExampleSelective(@Param("record") CmsNationalregion record, @Param("example") CmsNationalregionExample example);

    int updateByExample(@Param("record") CmsNationalregion record, @Param("example") CmsNationalregionExample example);

    int updateByPrimaryKeySelective(CmsNationalregion record);

    int updateByPrimaryKey(CmsNationalregion record);

    String selectRegionId(String s);


    /**
     * 获取地区码
     * @param parentId
     * @return
     */
    Long selectParentId(Long parentId );

    /**
     * 获取地区名称
     * @param parentId
     * @return
     */
    String selectRegionName(Long parentId );
}