package com.sn.search;

import com.sn.entity.PageResult;
import com.sn.pojo.CmsGovernmenthotsiterm;

import java.util.List;

public interface SearchGovernmenthotsitermService {

    /**
     * 返回全部列表
     * @return
     */
    public List<CmsGovernmenthotsiterm> findAll();


    /**
     * 返回分页列表
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize);


    /**
     * 增加
     */
    public void add(CmsGovernmenthotsiterm governmenthotsiterm);


    /**
     * 修改
     */
    public void update(CmsGovernmenthotsiterm governmenthotsiterm);


    /**
     * 根据ID获取实体
     * @param id
     * @return
     */
    public CmsGovernmenthotsiterm findOne(Long id);


    /**
     * 批量删除
     * @param ids
     */
    public void delete(Long[] ids);

    /**
     * 分页
     * @param pageNum 当前页 码
     * @param pageSize 每页记录数
     * @return
     */
    public PageResult findPage(CmsGovernmenthotsiterm governmenthotsiterm, int pageNum, int pageSize);

}
