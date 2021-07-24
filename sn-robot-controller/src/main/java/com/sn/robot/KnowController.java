package com.sn.robot;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sn.search.KnowInterface;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/kc")

public class KnowController {

    @Reference
    private KnowInterface knowInterface;


    @RequestMapping("/search")
    public Map search(@RequestBody Map searchMap ){
        return knowInterface.search(searchMap);
    }
}
