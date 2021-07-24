package com.sn.search;
import com.sn.entity.PageResult;
import com.sn.pojo.QaDialogue;

import java.util.List;


/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface DialogueService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<QaDialogue> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(QaDialogue dialogue);
	
	
	/**
	 * 修改
	 */
	public void update(QaDialogue dialogue);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public QaDialogue findOne(Integer id);
	
	
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
	public PageResult findPage(QaDialogue dialogue, int pageNum, int pageSize);

	/**
	 * 更新数据
	 */
	public void uodateshuju();
	
}
