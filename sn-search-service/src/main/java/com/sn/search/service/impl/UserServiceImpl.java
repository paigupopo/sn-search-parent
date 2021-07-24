package com.sn.search.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sn.entity.PageResult;
import com.sn.mapper.UserMapper;
import com.sn.pojo.User;
import com.sn.pojo.UserExample;
import com.sn.search.SearchUserInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
@SuppressWarnings("all")
public class UserServiceImpl implements SearchUserInterface {

   @Autowired
    private UserMapper mapper;
    /**
     * 查询全部
     */
    @Override
    public List<User> findAll() {
        return mapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<User> page=   (Page<User>) mapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }




    /**
     * 增加
     */
    @Override
    public void add(User dialogue) {
        mapper.insert(dialogue);
    }



    /**
     * 批量删除
     */
    @Override
    public void delete(Integer[] ids) {
        for(Integer id:ids){
            mapper.deleteByExample(null);
        }
    }

    @Override
    public PageResult findPage(User knowledgelib, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        UserExample example=new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        Page<User> page= (Page<User>)mapper.selectByExample(example);


        return new PageResult(page.getTotal(), page.getResult());
    }


    }

