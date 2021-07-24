package com.sn.robot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sn.entity.PageResult;
import com.sn.mapper.CmsGovernmenthotsMapper;
import com.sn.pojo.CmsGovernmenthots;
import com.sn.search.GovernmenthotsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service(timeout = 5000)
public class GovernmerthotsImpl implements GovernmenthotsService{

    @Autowired
    private CmsGovernmenthotsMapper governmenthotsMapper;







    @Override
    public List<CmsGovernmenthots> findAll() {
        return governmenthotsMapper.selectByExample(null);
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<CmsGovernmenthots> page=   (Page<CmsGovernmenthots>) governmenthotsMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public void add(CmsGovernmenthots governmenthots) {

        governmenthots.setGovcustom(0);
        synchronized ("锁"){
            List<CmsGovernmenthots> governmenthots1 = governmenthotsMapper.selectByExample(null);
            for (int i = 0; i < governmenthots1.size(); i++) {
                if (governmenthots1.get(i).getGovhotname().equals(governmenthots.getGovhotname())){
                    return;
                }
            }

            governmenthotsMapper.insert(governmenthots);


        }





    }


    @Override
    public CmsGovernmenthots findOne(Long id) {
        return governmenthotsMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delete(Long[] ids) {
        for(Long id:ids){
            governmenthotsMapper.deleteByPrimaryKey(id);
        }

    }

    /**
     * 热词
     * @return
     */
    @Override
    public List selectName() {
        return governmenthotsMapper.selectName();
    }

    @Override
    public List GovHotIp(Object aLong) {
        return null;
    }




}
