package com.sn.robot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sn.entity.PageResult;
import com.sn.mapper.CmsGovernmenthotsMapper;
import com.sn.mapper.CmsGovernmenthotsitermMapper;
import com.sn.pojo.CmsGovernmenthotsiterm;
import com.sn.pojo.CmsGovernmenthotsitermExample;
import com.sn.search.GovernmenthotsitermService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class GovernmenthotsitermServiceImpl implements GovernmenthotsitermService {

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

	/**
	 * 查询总计访问量
	 * @return
	 */
	@Override
	public Long selectcount() {
		return governmenthotsitermMapper.selectcount();
	}

	@Override
	public List selectAddress() {
		return governmenthotsitermMapper.selectAddress();
	}

	/**
	 * 总计搜索量
	 * @return
	 */
	@Override
	public Long selectItem() {
		return governmenthotsitermMapper.selectItem();
	}

    /**
     * 计算本月比上月的增长率
     * @return
     */
    @Override
    public Float thisMonth() {


        Long thisLong = governmenthotsitermMapper.thisMonth();
        Long lastLong = governmenthotsitermMapper.lastMonth();

        if(thisLong!=null){
			Double v = thisLong.doubleValue();
			Double v1 = lastLong.doubleValue();

			Double d=(v-v1)/v1*100;
			String result = String .format("%.2f",d);
			Float aLong =Float.valueOf(result);

			return aLong;

		}else {
        	return null;
		}




    }

	/**
	 * 上月搜索量
	 * @return
	 */
    @Override
    public Float lastMonth() {

        return  null;
    }

	/**
	 * 本月访问量
	 * @return
	 */
	@Override
	public Float thisMonthCount() {

		Long thisLong = governmenthotsitermMapper.thisMonthCount();
		Long lastLong = governmenthotsitermMapper.lastMonthCount();

		Double v = thisLong.doubleValue();
		Double v1 = lastLong.doubleValue();

		Double d=(v-v1)/v1*100;


		String result = String .format("%.2f",d);
		Float aLong =Float.valueOf(result);


		return  aLong;

	}


	/**
	 * 上月访问量
	 * @return
	 */
	@Override
	public Float lastMonthCount() {
		return null;
	}

	/**
	 * 计算每个月数据
	 * @return
	 */
	@Override
	public List selectMonth(String day) {
		return  governmenthotsitermMapper.selectMonth(day);

	}

	/**
	 * 计算每个省份的数据
	 * @return
	 */
	@Override
	public List selectCity() {

		return  governmenthotsitermMapper.selectCity();



	}


	@Override
	public List selectAddressCount() {
		return governmenthotsitermMapper.selectAddressCount();


	}

	@Override
	public List govHotIP(Object o) {
		return null;
	}


}
