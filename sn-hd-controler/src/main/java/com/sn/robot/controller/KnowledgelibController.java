package com.sn.robot.controller;
import com.alibaba.dubbo.config.annotation.Reference;
import com.sn.entity.PageResult;
import com.sn.entity.Result;
import com.sn.pojo.Knowledgelib;
import com.sn.search.KnowledgelibService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/knowledgelib")
@SuppressWarnings("all")
public class KnowledgelibController {

	@Reference
	private KnowledgelibService  knowledgelibService;
	HtmlUtils htmlUtils=new HtmlUtils();
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Knowledgelib> findAll(){

        List<Knowledgelib> all = knowledgelibService.findAll();
        for (Knowledgelib knowledgelib : all) {
            String qaklContent = knowledgelib.getQaklContent();
            knowledgelib.setQaklContent(htmlUtils.Html2Text(qaklContent));
        }
        return all;
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		HtmlUtils htmlUtils=new HtmlUtils();
		List<Knowledgelib> all = knowledgelibService.findAll();
		for (Knowledgelib knowledgelib : all) {
			String qaklContent = knowledgelib.getQaklContent();
			knowledgelib.setQaklContent(htmlUtils.Html2Text(qaklContent));
		}
		return knowledgelibService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param knowledgelib
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Knowledgelib knowledgelib){
		try {
			knowledgelibService.add(knowledgelib);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param knowledgelib
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Knowledgelib knowledgelib){
		try {
			knowledgelibService.update(knowledgelib);
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
	public Knowledgelib findOne(Integer id){
		return knowledgelibService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			knowledgelibService.delete(ids);
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
	public PageResult search(@RequestBody Knowledgelib knowledgelib, int page, int rows  ){


		return knowledgelibService.findPage(knowledgelib, page, rows);		
	}

	@RequestMapping("/solrupdate")
	public Result solrupdate(){
		try {
			knowledgelibService.updateSOlr();
			return new Result(true, "更新成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "更新失败");
		}
	}

	/**
	 * 搜索文本数据
	 * @return
	 */
	@RequestMapping("/knoSearch")
	public  List knoSearch(@RequestBody Map searchMap){
		return  knowledgelibService.knoSearch(searchMap);
	}


	/**
	 * 查询知识库数据总数
	 * @return
	 */
	@RequestMapping("/selectCount")
	public Long selectCount() {
		return knowledgelibService.selectCount();
	}
}
