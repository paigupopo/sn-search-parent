package com.sn.search.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sn.pojo.Layout;
import com.sn.search.LayoutIterface;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/layout")
public class LayoutController {

    @Reference
    private LayoutIterface layout;

    /**
     * 返回全部列表
     * @return
     */
    @RequestMapping("/findAll")
    public List<Layout> findAll(@RequestBody Map searchMap){
        return layout.findAll(searchMap);
    }


    @RequestMapping("/layoutList")
    public List<Layout> layoutList(@RequestBody Map searchMap){
        return layout.layoutList(searchMap);
    }

}
