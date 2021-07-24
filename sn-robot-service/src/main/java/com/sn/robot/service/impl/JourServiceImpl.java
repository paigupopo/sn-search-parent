package com.sn.robot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sn.search.JourInterface;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrRequest;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;

@Service(timeout = 15000)
public class JourServiceImpl implements JourInterface {

    @Autowired
    private SolrServer solrServer;




    /**
     *
     * 查询文章的总数
     * @return
     */

    @Override
    public Long selectCount() {
        long num = 0;

        try {
            SolrQuery params = new SolrQuery();
            params.set("q", "jo_keywords:*");
            QueryResponse rsp = solrServer.query(params, SolrRequest.METHOD.POST);
            SolrDocumentList docs = rsp.getResults();
            num = docs.getNumFound();
        } catch (SolrServerException e) {
            e.printStackTrace();
        }
        return num;

    }
}
