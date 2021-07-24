package com.sn.robot.service.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sn.entity.PageResult;
import com.sn.mapper.QaDialogueMapper;
import com.sn.pojo.QaDialogue;
import com.sn.pojo.QaDialogueExample;
import com.sn.search.DialogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.solr.core.SolrTemplate;

import java.util.List;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service(timeout = 10000)
@SuppressWarnings("all")
public class DialogueServiceImpl implements DialogueService {

	@Autowired
	private QaDialogueMapper dialogueMapper;



	@Autowired
	private SolrTemplate solrTemplate;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<QaDialogue> findAll() {
		return dialogueMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<QaDialogue> page=   (Page<QaDialogue>) dialogueMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(QaDialogue dialogue) {
		dialogueMapper.insert(dialogue);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(QaDialogue dialogue){
		dialogueMapper.updateByPrimaryKey(dialogue);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public QaDialogue findOne(Integer id){
		return dialogueMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			dialogueMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
	@Override
	public PageResult findPage(QaDialogue dialogue, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		QaDialogueExample example=new QaDialogueExample();
            QaDialogueExample.Criteria criteria = example.createCriteria();
            if(dialogue!=null){
						if(dialogue.getQadTitle()!=null && dialogue.getQadTitle().length()>0){
				criteria.andQadTitleLike("%"+dialogue.getQadTitle()+"%");
			}
		}

        Page<QaDialogue> page= (Page<QaDialogue>)dialogueMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 更新数据
	 */
	@Override
	public void uodateshuju() {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath*:spring/applicationContext*.xml");

		QaDiaLogService test = (QaDiaLogService) context.getBean("qaDiaLogService");
		test.importd();


	}

	
}
