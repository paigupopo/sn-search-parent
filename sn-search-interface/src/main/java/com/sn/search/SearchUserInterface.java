package com.sn.search;

import com.sn.entity.PageResult;
import com.sn.pojo.User;

import java.util.List;

public interface SearchUserInterface {
    /**
     * 返回全部列表
     * @return
     */
    public List<User> findAll();


    /**
     * 返回分页列表
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize);


    /**
     * 增加
     */
    public void add(User user);


    /**
     * 批量删除
     * @param ids
     */
    public void delete(Integer[] ids);

    /**
     * 分页
     * @param pageNum 当前页 码
     * @param pageSize 每页记录数
     * @return
     */
    public PageResult findPage(User knowledgelib, int pageNum, int pageSize);


}
