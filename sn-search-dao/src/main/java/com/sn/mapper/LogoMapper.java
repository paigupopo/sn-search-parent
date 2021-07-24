package com.sn.mapper;

import com.sn.pojo.Logo;
import com.sn.pojo.LogoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LogoMapper {
    long countByExample(LogoExample example);

    int deleteByExample(LogoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Logo record);

    int insertSelective(Logo record);

    List<Logo> selectByExample(LogoExample example);

    Logo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Logo record, @Param("example") LogoExample example);

    int updateByExample(@Param("record") Logo record, @Param("example") LogoExample example);

    int updateByPrimaryKeySelective(Logo record);

    int updateByPrimaryKey(Logo record);

    /**
     * logo设置
     * @param groupId
     * @return
     */

    String selectLogo(Long groupId);


}