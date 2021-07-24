package com.sn.robot.controller;
import java.util.List;

import com.sn.entity.PageResult;
import com.sn.entity.Result;
import com.sn.pojo.QaDialogue;
import com.sn.search.DialogueService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;




/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/dialogue")
public class DialogueController {

	@Reference
	private DialogueService dialogueService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<QaDialogue> findAll(){
		return dialogueService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return dialogueService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param dialogue
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody QaDialogue dialogue){
		try {
			dialogueService.add(dialogue);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param dialogue
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody QaDialogue dialogue){
		try {
			dialogueService.update(dialogue);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public QaDialogue findOne(Integer id){
		return dialogueService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			dialogueService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody QaDialogue dialogue, int page, int rows  ){
		return dialogueService.findPage(dialogue, page, rows);		
	}

	/**
	 * 更新solr数据
	 */
	@RequestMapping("/updatesolr")
	public Result updatesolr(){

		try {
			dialogueService.uodateshuju();
			return new Result(true, "更新成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "更新失败");
		}
	}
	
}
