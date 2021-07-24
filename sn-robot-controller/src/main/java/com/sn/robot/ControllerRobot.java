package com.sn.robot;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sn.search.RobotInterface;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/robot")

public class ControllerRobot {
    @Reference
    private RobotInterface robotInterface;



    @RequestMapping("/search")
    public Map search(@RequestBody Map searchMap ){
        return robotInterface.search(searchMap);
    }

}
