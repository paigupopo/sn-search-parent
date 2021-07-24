package com.sn.mapper;

import com.sn.pojo.CmsSensitiveword;
import com.sn.pojo.CmsSensitivewordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsSensitivewordMapper {
    long countByExample(CmsSensitivewordExample example);

    int deleteByExample(CmsSensitivewordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsSensitiveword record);

    int insertSelective(CmsSensitiveword record);

    List<CmsSensitiveword> selectByExample(CmsSensitivewordExample example);

    CmsSensitiveword selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsSensitiveword record, @Param("example") CmsSensitivewordExample example);

    int updateByExample(@Param("record") CmsSensitiveword record, @Param("example") CmsSensitivewordExample example);

    int updateByPrimaryKeySelective(CmsSensitiveword record);

    int updateByPrimaryKey(CmsSensitiveword record);
}