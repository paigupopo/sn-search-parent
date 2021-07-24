package com.sn.search;
import com.sn.entity.PageResult;
import com.sn.pojo.Knowledgelib;

import java.util.List;
import java.util.Map;


/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface KnowledgelibService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Knowledgelib> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Knowledgelib knowledgelib);
	
	
	/**
	 * 修改
	 */
	public void update(Knowledgelib knowledgelib);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Knowledgelib findOne(Integer id);
	
	
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
	public PageResult findPage(Knowledgelib knowledgelib, int pageNum, int pageSize);

	/**
	 * 更新solr数据
	 */
	public void updateSOlr();


	/**
	 * 查询知识库数据
	 * @return
	 */
	List knoSearch(Map searchMap);

	/**
	 * 查询知识库数据总数
	 * @return
	 */
	Long selectCount();
}
