package com.sn.search;

import com.sn.entity.PageResult;
import com.sn.pojo.Leader;

import java.util.List;

public interface LeaderService {

    /**
     * 返回全部列表
     * @return
     */
    public List<Leader> findAll();


    /**
     * 返回分页列表
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize);


    /**
     * 增加
     */
    public void add(Leader leader);


    /**
     * 修改
     */
    public void update(Leader leader);


    /**
     * 根据ID获取实体
     * @param id
     * @return
     */
    public Leader findOne(Long id);


    /**
     * 批量删除
     * @param ids
     */
    public void delete(Long[] ids);

    /**
     * 更新solr数据
     */
    void updateSOlr();

    /**
     * 分页
     * @param pageNum 当前页 码
     * @param pageSize 每页记录数
     * @return
     */
    public PageResult findPage(Leader leader, int pageNum, int pageSize);


}
