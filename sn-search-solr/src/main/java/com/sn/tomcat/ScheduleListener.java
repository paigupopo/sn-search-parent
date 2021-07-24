package com.sn.tomcat;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleListener implements ServletContextListener {

    private static ScheduledExecutorService service4Check;
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        CheckSchedule();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

        CheckSchedule();
    }
    public static  void CheckSchedule(){
        service4Check= Executors.newScheduledThreadPool(1);
        service4Check.scheduleWithFixedDelay(new CheckTask(), 1000, 60*60*12*1000,
                TimeUnit.MILLISECONDS);//每二十四个小时执行一次
        //3600 *24


    }
}
