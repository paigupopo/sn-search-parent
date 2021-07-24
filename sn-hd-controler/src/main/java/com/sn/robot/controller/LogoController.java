package com.sn.robot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sn.entity.PageResult;
import com.sn.entity.Result;
import com.sn.pojo.Logo;
import com.sn.search.logoInterface;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/logo")
public class LogoController {

    @Reference
    private logoInterface logointrtface;

    /**
     * 查询全部
     * @return
     */
    @RequestMapping("/findAll")
    public List<Logo> findAll(){

       return logointrtface.findAll();

    }

    /**
     * 分页查询
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/findPage")
    public PageResult findPage(int page, int rows){

       return logointrtface.findPage(page,rows);

    }

    /**
     * 增加
     * @param logo
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody Logo logo){
        try {
            logointrtface.add(logo);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
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
    public PageResult search(@RequestBody Logo logo, int page, int rows  ){


        return logointrtface.findPage(logo, page, rows);
    }

    /**
     * 获取实体
     * @param id
     * @return
     */
    @RequestMapping("/findOne")
    public Logo findOne(Long id){
        return logointrtface.findOne(id);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(Long [] ids){
        try {
            logointrtface.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    /**
     * 修改
     * @param logo
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Logo logo){
        try {
            logointrtface.update(logo);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }




}
