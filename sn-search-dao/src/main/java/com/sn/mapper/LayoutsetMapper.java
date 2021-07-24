package com.sn.mapper;

import com.sn.pojo.Layoutset;
import com.sn.pojo.LayoutsetExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LayoutsetMapper {
    long countByExample(LayoutsetExample example);

    int deleteByExample(LayoutsetExample example);

    int deleteByPrimaryKey(Long layoutsetid);

    int insert(Layoutset record);

    int insertSelective(Layoutset record);

    List<Layoutset> selectByExampleWithBLOBs(LayoutsetExample example);

    List<Layoutset> selectByExample(LayoutsetExample example);

    Layoutset selectByPrimaryKey(Long layoutsetid);

    int updateByExampleSelective(@Param("record") Layoutset record, @Param("example") LayoutsetExample example);


    int updateByExample(@Param("record") Layoutset record, @Param("example") LayoutsetExample example);

    int updateByPrimaryKeySelective(Layoutset record);


    int updateByPrimaryKey(Layoutset record);

    Long selectout(Long groupId);


}