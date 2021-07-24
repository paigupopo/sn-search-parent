package com.sn.search;

import com.sn.entity.PageResult;
import com.sn.pojo.Logo;

import java.util.List;

public interface logoInterface {


    /**
     * 返回全部列表
     * @return
     */
    public List<Logo> findAll();


    /**
     * 返回分页列表
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize);


    /**
     * 增加
     */
    public void add(Logo logo);


    /**
     * 修改
     */
    public void update(Logo logo);


    /**
     * 根据ID获取实体
     * @param id
     * @return
     */
    public Logo findOne(Long id);


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
    public PageResult findPage(Logo logo, int pageNum, int pageSize);
}
