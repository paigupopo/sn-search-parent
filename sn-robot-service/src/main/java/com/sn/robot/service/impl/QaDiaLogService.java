package com.sn.robot.service.impl;

import com.sn.mapper.QaDialogueMapper;
import com.sn.pojo.QaDialogue;
import com.sn.pojo.QaDialogueExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@SuppressWarnings("all")
public class QaDiaLogService {

    @Autowired
    private QaDialogueMapper qaDialogueMapper;
    
    @Autowired
    private SolrTemplate solrTemplate;

    /**
     * 导入寒暄库数据
     */
    public void importd(){
        /**
         * 删除以前数据
         */
        Query query2=new SimpleQuery("qad_title:*");

        solrTemplate.delete(query2);

        QaDialogueExample qaDialogueExample=new QaDialogueExample();
        QaDialogueExample.Criteria criteria = qaDialogueExample.createCriteria();
        criteria.andQadStateEqualTo(1);
        List<QaDialogue> qaDialogues = qaDialogueMapper.selectByExample(qaDialogueExample);
        for (QaDialogue qaDialogue : qaDialogues) {
            qaDialogue.setId(qaDialogue.getQadId()+100);
        }
        solrTemplate.saveBeans(qaDialogues);
        solrTemplate.commit();

    }
}
