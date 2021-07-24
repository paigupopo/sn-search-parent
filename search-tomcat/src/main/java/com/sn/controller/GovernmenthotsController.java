package com.sn.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sn.entity.PageResult;
import com.sn.entity.Result;
import com.sn.pojo.CmsGovernmenthots;
import com.sn.search.GovernmenthotsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Governmenthots")
public class GovernmenthotsController {

    @Reference
    private GovernmenthotsService service;


    /**
     * 返回全部列表
     * @return
     */
    @RequestMapping("/findAll")
    public List<CmsGovernmenthots> findAll(){
        return service.findAll();
    }


    /**
     * 返回全部列表
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult findPage(int page, int rows){
        return service.findPage(page, rows);
    }

    /**
     * 增加
     * @param governmenthots
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody CmsGovernmenthots governmenthots){
        try {
            service.add(governmenthots);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }



    /**
     * 获取实体
     * @param id
     * @return
     */
    @RequestMapping("/findOne")
    public CmsGovernmenthots findOne(Long id){
        return service.findOne(id);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(Long [] ids){
        try {
            service.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }


}
