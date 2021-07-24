package com.sn.search;
import com.sn.entity.PageResult;
import com.sn.pojo.CmsGovernmenthotsiterm;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface GovernmenthotsitermService {

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

	/**
	 * 总搜索数
	 * @return
	 */
	Long selectcount();

	/**
	 * 查询搜索数据集合
	 * @return
	 */
	List selectAddress();

	/**
	 * 访问量
	 * @return
	 */
    Long selectItem();

    /**
     * 本月搜索量
     * @return
     */
    Float thisMonth();

    /**
     * 上月搜索量
     * @return
     */
	Float lastMonth();

	/**
	 * 本月访问量
	 * @return
	 */
	Float thisMonthCount();

	/**
	 * 上月访问量
	 * @return
	 */
	Float lastMonthCount();

	/**
	 * 计算每个月
	 * @return
	 */
	List selectMonth(String day);


	/**
	 * 每个省份的搜素量
	 * @return
	 */
	List selectCity();

	/**
	 * 每个地区的搜索量
	 *
	 * @return
	 */
	List selectAddressCount();


	/**
	 * 查看当前用户
	 * @param o
	 * @return
	 */
	List govHotIP(Object o);



}
