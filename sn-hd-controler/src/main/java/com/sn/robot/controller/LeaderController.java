package com.sn.robot.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.sn.entity.PageResult;
import com.sn.entity.Result;
import com.sn.pojo.Leader;
import com.sn.search.LeaderService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/leader")
public class LeaderController {


    @Reference
    private LeaderService leaderService;


    /**
     * 返回全部列表
     * @return
     */
    @RequestMapping("/findAll")
    public List<Leader> findAll(){

        return leaderService.findAll();
    }


    /**
     * 分页返回全部列表
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult findPage(int page, int rows){

        return leaderService.findPage(page, rows);
    }

    /**
     * 增加
     * @param leader
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody Leader leader){
        try {
            leaderService.add(leader);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /**
     * 修改
     * @param leader
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Leader leader){
        try {
            leaderService.update(leader);
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
    public Leader findOne(Long id){
        return leaderService.findOne(id);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(Long[] ids){
        try {
            leaderService.delete(ids);
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
    public PageResult search(@RequestBody Leader leader, int page, int rows  ){


        return leaderService.findPage(leader, page, rows);
    }

    /**|
     * 更新solr数据
     * @return
     */
    @RequestMapping("/solrUpdate")
    public Result solrUpdate(){
        try {
            leaderService.updateSOlr();
            return new Result(true, "更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "更新失败");
        }
    }


}
