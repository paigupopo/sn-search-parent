package com.sn.search.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sn.mapper.LayoutMapper;
import com.sn.pojo.Layout;
import com.sn.search.LayoutIterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service(timeout = 5000)
@SuppressWarnings("all")
public class LayoutImpl implements LayoutIterface {


    @Autowired
    private LayoutMapper mapper;
    HtmlUtils htmlUtils=new HtmlUtils();


    /**
     * 获取站点数据
     * @return
     */
    @Override
    public List<Layout> findAll(Map searchMap) {

        Object group = searchMap.get("groupId");
        System.out.println(group);

        Long l = Long.valueOf(String.valueOf(group));
        System.out.println(l);


        List<Layout> list = mapper.selectName(l);
        for (Layout layout : list) {
            String name = layout.getName();
            layout.setName(htmlUtils.Html2Text(name));
        }
        return list;

    }



    @Override
    public List<Layout> layoutList(Map searchmap) {
        List<Layout> list=new ArrayList();
        String layoutname = (String) searchmap.get("layoutname");
        Object group = searchmap.get("groupId");

        Long l = Long.valueOf(String.valueOf(10184));

        if (layoutname!=null&&!layoutname.equals("")){
            Long aLong = mapper.selectLayout(l,layoutname);

            if(aLong!=null){
                list = mapper.selectLayoutName(l,aLong);

                for (Layout layout : list) {
                    layout.setName(htmlUtils.Html2Text(layout.getName()));
                    //System.out.println(layout.getName());
                }
            }
        }
        return list;

    }


}
