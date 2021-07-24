package com.sn.mapper;

import com.sn.pojo.Assetcategory;
import com.sn.pojo.AssetcategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AssetcategoryMapper {
    long countByExample(AssetcategoryExample example);

    int deleteByExample(AssetcategoryExample example);

    int deleteByPrimaryKey(Long categoryid);

    int insert(Assetcategory record);

    int insertSelective(Assetcategory record);

    List<Assetcategory> selectByExample(AssetcategoryExample example);

    Assetcategory selectByPrimaryKey(Long categoryid);

    int updateByExampleSelective(@Param("record") Assetcategory record, @Param("example") AssetcategoryExample example);

    int updateByExample(@Param("record") Assetcategory record, @Param("example") AssetcategoryExample example);

    int updateByPrimaryKeySelective(Assetcategory record);

    int updateByPrimaryKey(Assetcategory record);

    String selectCategoryId(String str);
}