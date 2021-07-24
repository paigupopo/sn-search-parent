package com.sn.robot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sn.entity.PageResult;
import com.sn.mapper.LeaderMapper;
import com.sn.pojo.Leader;
import com.sn.pojo.LeaderExample;
import com.sn.search.LeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 服务层实现
 */
@Service(timeout = 10000)
public class LeaderServiceImpl implements LeaderService {

    @Autowired
    private LeaderMapper mapper;

    /**
     * 查询全部
     * @return
     */
    @Override
    public List<Leader> findAll() {
        return mapper.selectByExample(null);
    }

    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<Leader> page=   (Page<Leader>) mapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 添加
     * @param leader
     */
    @Override
    public void add(Leader leader) {

        mapper.insert(leader);

    }

    /**|
     * 修改
     * @param leader
     */
    @Override
    public void update(Leader leader) {

        mapper.updateByPrimaryKey(leader);

    }

    /**
     * 根据id获取实体
     * @param id
     * @return
     */
    @Override
    public Leader findOne(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    /**
     * 根据选中的id删除数据
     * @param ids
     */
    @Override
    public void delete(Long[] ids) {
        for(Long id:ids){
            mapper.deleteByPrimaryKey(id);
        }

    }

    @Override
    public PageResult findPage(Leader leader, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        LeaderExample example=new LeaderExample();
        LeaderExample.Criteria criteria = example.createCriteria();
      if(leader!=null){
          if(leader.getQalName()!=null&&leader.getQalName().length()>0){
              criteria.andQalNameLike("%"+leader.getQalName()+"%");
          }

      }
        Page<Leader> page= (Page<Leader>)mapper.selectByExample(example);

        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 更新solr数据
     */
    @Override
    public void updateSOlr() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath*:spring/applicationContext*.xml");

        LeaderSolr leaderSolr = (LeaderSolr) context.getBean("leaderSolr");

        leaderSolr.importLeader();
    }



}
