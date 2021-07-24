package com.sn.robot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONArray;
import com.sn.entity.PageResult;
import com.sn.entity.Result;
import com.sn.pojo.CmsGovernmenthotsiterm;
import com.sn.search.GovernmenthotsitermService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/governmenthotsiterm")
public class GovernmenthotsitermController {

	@Reference
	private GovernmenthotsitermService governmenthotsitermService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<CmsGovernmenthotsiterm> findAll(){
		return governmenthotsitermService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return governmenthotsitermService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param governmenthotsiterm
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody CmsGovernmenthotsiterm governmenthotsiterm){
		try {
			governmenthotsitermService.add(governmenthotsiterm);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param governmenthotsiterm
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody CmsGovernmenthotsiterm governmenthotsiterm){
		try {
			governmenthotsitermService.update(governmenthotsiterm);
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
	public CmsGovernmenthotsiterm findOne(Long id){
		return governmenthotsitermService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			governmenthotsitermService.delete(ids);
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
	public PageResult search(@RequestBody CmsGovernmenthotsiterm governmenthotsiterm, int page, int rows  ){
		return governmenthotsitermService.findPage(governmenthotsiterm, page, rows);		
	}

	/**
	 * 总搜索数量
	 * @return
	 */
	@RequestMapping("/selectCount")
	public Long selectCount(){
		return governmenthotsitermService.selectcount();
	}



	/**
	 * 查询搜索数据集合
	 * @return
	 */
	@RequestMapping("/selectAddress")
	public List selectAddress(){
		return  governmenthotsitermService.selectAddress();
	};

	/**
	 * 访问量
	 * @return
	 */

	@RequestMapping("selectItem")
	public Long selectItem(){
		return  governmenthotsitermService.selectItem();
	}

    /**
     * 搜索次数的月增长
     * @return
     */
    @RequestMapping("thisMonth")
	public Float thisMonth(){
	    return  governmenthotsitermService.thisMonth();
    }

    /**
     * 访问量的月增长
     * @return
     */
    @RequestMapping("thisMonthCount")
    public Float thisMonthCount(){
        return  governmenthotsitermService.thisMonthCount();
    }


	/**
	 *查询每个月数据
	 * @return
	 */
	@RequestMapping("selectMonth")
	public  Object selectMonth(String day){
        List list = governmenthotsitermService.selectMonth(day);
        Object o = JSONArray.toJSON(list);
        return o;

    }

	/**
	 * 查询每个省份数据
	 * @return
	 */

	@RequestMapping("selectCity")
	public List selectCity(){
		return  governmenthotsitermService.selectCity();
	}

	/**
	 *每个省份总数据
	 * @return
	 */
	@RequestMapping("selectCityAddress")
	public Object selectCityAddress(){
        List list = governmenthotsitermService.selectAddressCount();
        Object o = JSONArray.toJSON(list);
        return o;
	}
}
