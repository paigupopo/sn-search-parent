package com.sn.mapper;

import com.sn.pojo.Knowledgelib;
import com.sn.pojo.KnowledgelibExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KnowledgelibMapper {
    long countByExample(KnowledgelibExample example);

    int deleteByExample(KnowledgelibExample example);

    int deleteByPrimaryKey(Integer revision);

    int insert(Knowledgelib record);

    int insertSelective(Knowledgelib record);

    List<Knowledgelib> selectByExample(KnowledgelibExample example);

    Knowledgelib selectByPrimaryKey(Integer revision);

    int updateByExampleSelective(@Param("record") Knowledgelib record, @Param("example") KnowledgelibExample example);

    int updateByExample(@Param("record") Knowledgelib record, @Param("example") KnowledgelibExample example);

    int updateByPrimaryKeySelective(Knowledgelib record);

    int updateByPrimaryKey(Knowledgelib record);

    /**
     * 查询知识库数据
     * @return
     */
    List knoSearch(@Param("qakl_Content") String str);

    /**
     * 查询知识库数据总数
     * @return
     */
    Long selectCount();

    List solrStart();
}