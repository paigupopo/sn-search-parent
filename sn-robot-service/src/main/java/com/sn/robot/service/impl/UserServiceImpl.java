package com.sn.robot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sn.entity.PageResult;
import com.sn.mapper.CmsGovernmenthotsitermMapper;
import com.sn.mapper.UserMapper;
import com.sn.pojo.User;
import com.sn.pojo.UserExample;
import com.sn.search.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
@SuppressWarnings("all")
public class UserServiceImpl implements UserInterface {

    @Autowired
    private UserMapper mapper;

    @Autowired
    private CmsGovernmenthotsitermMapper cmsGovernmenthotsitermMapper;
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
     * 获取实体
     * @param id
     * @return
     */
    @Override
    public User findOne(String id) {
        return mapper.selectByPrimaryKey(id);
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


    /**
     * 修改密码
     * @param password
     */
    @Override
    public void updateByPrimaryKey(String password,String name) {

        String key="admin";
        String encrypt = MD5Util.encrypt(password, key);
        mapper.updateBypassword(encrypt, name);

    }

    /**
     * 获取密码
     * @param name
     * @return
     */
    @Override
    public String selectPwd(String username) {
        String key="admin";
        String s = mapper.selectPwd(username);
        //对获取的 数据库的密码进行解密
        String decrypt = MD5Util.decrypt(s, key);

        return decrypt;
    }


}
