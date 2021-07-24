package com.sn.mapper;

import com.sn.pojo.Viewbox;
import com.sn.pojo.ViewboxExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ViewboxMapper {
    long countByExample(ViewboxExample example);

    int deleteByExample(ViewboxExample example);

    int deleteByPrimaryKey(Long fangtanid);

    int insert(Viewbox record);

    int insertSelective(Viewbox record);

    List<Viewbox> selectByExample(ViewboxExample example);

    Viewbox selectByPrimaryKey(Long fangtanid);

    int updateByExampleSelective(@Param("record") Viewbox record, @Param("example") ViewboxExample example);

    int updateByExample(@Param("record") Viewbox record, @Param("example") ViewboxExample example);

    int updateByPrimaryKeySelective(Viewbox record);

    int updateByPrimaryKey(Viewbox record);


}