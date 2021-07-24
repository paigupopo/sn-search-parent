package com.sn.robot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sn.search.JourInterface;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jour")
public class JourController {

    @Reference
    private JourInterface searchInterface;


    @RequestMapping("/selectCount")
    public Long selectCount(){
        return  searchInterface.selectCount();
    }

}
