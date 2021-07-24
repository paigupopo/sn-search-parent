package com.sn.robot.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sn.entity.PageResult;
import com.sn.mapper.LogoMapper;
import com.sn.pojo.Logo;
import com.sn.pojo.LogoExample;
import com.sn.search.logoInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(timeout = 5000)
public class LogoService implements logoInterface {

    @Autowired
    private LogoMapper logoMapper;

    /**
     * 查询全部
     * @return
     */
    @Override
    public List<Logo> findAll() {
        return logoMapper.selectByExample(null);
    }

    /**
     *分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {

        Page<Logo> logos = (Page<Logo>) logoMapper.selectByExample(null);

        return new PageResult(logos.getTotal(),logos.getResult());
    }

    /**
     * 添加数据
     * @param logo
     */
    @Override
    public void add(Logo logo) {

        logoMapper.insert(logo);

    }

    /**
     * 修改数据
     * @param logo
     */
    @Override
    public void update(Logo logo) {

        logoMapper.updateByPrimaryKey(logo);

    }

    /**
     * 获取实体
     * @param id
     * @return
     */
    @Override
    public Logo findOne(Long id) {
        return logoMapper.selectByPrimaryKey(id);
    }

    /**
     * 删除数据
     * @param ids
     */
    @Override
    public void delete(Long[] ids) {

        for (Long id : ids) {
            logoMapper.deleteByPrimaryKey(id);
        }


    }

    /**
     * 查询分页
     * @param logo
     * @param pageNum 当前页 码
     * @param pageSize 每页记录数
     * @return
     */
    @Override
    public PageResult findPage(Logo logo, int pageNum, int pageSize) {

        PageHelper.startPage(pageNum, pageSize);

        LogoExample example=new LogoExample();

        LogoExample.Criteria criteria = example.createCriteria();

        if(logo!=null){
            if(logo.getLogoimg()!=null && logo.getLogoimg().length()>0){
                criteria.andLogoimgLike("%"+logo.getLogoimg()+"%");
            }

        }
        Page<Logo> page= (Page<Logo>)logoMapper.selectByExample(example);


        return new PageResult(page.getTotal(), page.getResult());
    }
}
