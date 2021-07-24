package com.sn.robot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sn.entity.PageResult;
import com.sn.mapper.KnowledgelibMapper;
import com.sn.pojo.Knowledgelib;
import com.sn.pojo.KnowledgelibExample;
import com.sn.search.KnowledgelibService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service(timeout = 250000)
public class KnowledgelibServiceImpl implements KnowledgelibService  {

	@Autowired
	private KnowledgelibMapper knowledgelibMapper;

    HtmlUtils htmlUtils=new HtmlUtils();
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Knowledgelib> findAll() {
		return knowledgelibMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Knowledgelib> page=   (Page<Knowledgelib>) knowledgelibMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Knowledgelib knowledgelib) {
		knowledgelibMapper.insert(knowledgelib);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Knowledgelib knowledgelib){
		knowledgelibMapper.updateByPrimaryKey(knowledgelib);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Knowledgelib findOne(Integer id){
		return knowledgelibMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			knowledgelibMapper.deleteByPrimaryKey(id);
		}		
	}



	@Override
	public PageResult findPage(Knowledgelib knowledgelib, int pageNum, int pageSize) {


		PageHelper.startPage(pageNum, pageSize);

		KnowledgelibExample example=new KnowledgelibExample();
		KnowledgelibExample.Criteria criteria = example.createCriteria();

		if(knowledgelib!=null){
			if(knowledgelib.getQaklTitle()!=null && knowledgelib.getQaklTitle().length()>0){
				criteria.andQaklTitleLike("%"+knowledgelib.getQaklTitle()+"%");
			}

		}
		Page<Knowledgelib> page= (Page<Knowledgelib>)knowledgelibMapper.selectByExample(example);
        for (Knowledgelib knowledgelib1 : page) {
            knowledgelib1.setQaklContent(htmlUtils.Html2Text(knowledgelib1.getQaklContent()));
        }

		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 更新solr数据
	 */
	@Override
	public void updateSOlr() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath*:spring/applicationContext*.xml");

		Shuju test = (Shuju) context.getBean("shuju");
		test.importsj();
	}

	/**
	 * 搜索数据
	 * @param searchMap
	 * @return
	 */

	@Override
	public List<Knowledgelib> knoSearch( Map searchMap) {

		String str = (String) searchMap.get("str");

		List<Knowledgelib> list = knowledgelibMapper.knoSearch(str);
		for (Knowledgelib knowledgelib : list) {
			knowledgelib.setQaklContent(htmlUtils.Html2Text(knowledgelib.getQaklContent()));

		}

		return  list;
	}

	/**
	 * 查询知识库数据总数
	 * @return
	 */
	@Override
	public Long selectCount() {
		return knowledgelibMapper.selectCount();
	}


}
