package com.sn.mapper;

import com.sn.pojo.QaDialogue;
import com.sn.pojo.QaDialogueExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QaDialogueMapper {
    long countByExample(QaDialogueExample example);

    int deleteByExample(QaDialogueExample example);

    int deleteByPrimaryKey(Integer qadId);

    int insert(QaDialogue record);

    int insertSelective(QaDialogue record);

    List<QaDialogue> selectByExample(QaDialogueExample example);

    QaDialogue selectByPrimaryKey(Integer qadId);

    int updateByExampleSelective(@Param("record") QaDialogue record, @Param("example") QaDialogueExample example);

    int updateByExample(@Param("record") QaDialogue record, @Param("example") QaDialogueExample example);

    int updateByPrimaryKeySelective(QaDialogue record);

    int updateByPrimaryKey(QaDialogue record);
}