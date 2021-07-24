package com.sn.mapper;

import com.sn.pojo.Classname;
import com.sn.pojo.ClassnameExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassnameMapper {
    long countByExample(ClassnameExample example);

    int deleteByExample(ClassnameExample example);

    int deleteByPrimaryKey(Long classnameid);

    int insert(Classname record);

    int insertSelective(Classname record);

    List<Classname> selectByExample(ClassnameExample example);

    Classname selectByPrimaryKey(Long classnameid);

    int updateByExampleSelective(@Param("record") Classname record, @Param("example") ClassnameExample example);

    int updateByExample(@Param("record") Classname record, @Param("example") ClassnameExample example);

    int updateByPrimaryKeySelective(Classname record);

    int updateByPrimaryKey(Classname record);
}