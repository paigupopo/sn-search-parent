package com.sn.search.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sn.entity.PageResult;
import com.sn.mapper.CmsGovernmenthotsMapper;
import com.sn.mapper.CmsGovernmenthotsitermMapper;
import com.sn.pojo.CmsGovernmenthotsiterm;
import com.sn.pojo.CmsGovernmenthotsitermExample;
import com.sn.search.SearchGovernmenthotsitermService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;



/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
@SuppressWarnings("all")
public class GovernmenthotsitermServiceImpl implements SearchGovernmenthotsitermService {

	@Autowired
	private CmsGovernmenthotsitermMapper governmenthotsitermMapper;



    @Autowired
    private CmsGovernmenthotsMapper governmenthotsMapper;


	
	/**
	 * 查询全部
	 */
	@Override
	public List<CmsGovernmenthotsiterm> findAll() {
		return governmenthotsitermMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<CmsGovernmenthotsiterm> page=   (Page<CmsGovernmenthotsiterm>) governmenthotsitermMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(CmsGovernmenthotsiterm governmenthotsiterm) {

		synchronized ("锁"){
			Long l = governmenthotsMapper.selectGovHotId(governmenthotsiterm.getGovhotName());

			governmenthotsiterm.setGovhotid(l);
			governmenthotsiterm.setItemcount(1);

			if (governmenthotsiterm.getCityaddress().equals("CN")){
				governmenthotsiterm.setCityaddress("510900");
			}
			List<CmsGovernmenthotsiterm> governmenthotsiterms = governmenthotsitermMapper.selectByExample(null);

			boolean flag=false;

			for (int i = 0; i < governmenthotsiterms.size(); i++) {
				CmsGovernmenthotsiterm gov = governmenthotsiterms.get(i);

				if(gov.getGroupid()!=null&& governmenthotsiterm.getGroupid()!=null ){
					if(gov.getGroupid().compareTo(governmenthotsiterm.getGroupid())==0
							&&gov.getCityaddress().equals(governmenthotsiterm.getCityaddress())
							&&gov.getHotdate().equals(governmenthotsiterm.getHotdate()))
					{
						int itemcount = gov.getItemcount();
						itemcount+=1;
						governmenthotsiterm.setItemcount(itemcount);
						governmenthotsiterm.setItemid(gov.getItemid());

						flag=true;
						break;
					}
				}

			}
			if(flag){
				governmenthotsitermMapper.updateByPrimaryKey(governmenthotsiterm);
			}else{
				governmenthotsitermMapper.insert(governmenthotsiterm);

			}



		}



	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(CmsGovernmenthotsiterm governmenthotsiterm){
		governmenthotsitermMapper.updateByPrimaryKey(governmenthotsiterm);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public CmsGovernmenthotsiterm findOne(Long id){
		return governmenthotsitermMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			governmenthotsitermMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(CmsGovernmenthotsiterm governmenthotsiterm, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);

			CmsGovernmenthotsitermExample example=new CmsGovernmenthotsitermExample();
			CmsGovernmenthotsitermExample.Criteria criteria = example.createCriteria();
		
		if(governmenthotsiterm!=null){			
						if(governmenthotsiterm.getCityaddress()!=null && governmenthotsiterm.getCityaddress().length()>0){
				criteria.andCityaddressLike("%"+governmenthotsiterm.getCityaddress()+"%");
			}
			if(governmenthotsiterm.getHotresource()!=null && governmenthotsiterm.getHotresource().length()>0){
				criteria.andHotresourceLike("%"+governmenthotsiterm.getHotresource()+"%");
			}

	
		}
		
		Page<CmsGovernmenthotsiterm> page= (Page<CmsGovernmenthotsiterm>)governmenthotsitermMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}



}
