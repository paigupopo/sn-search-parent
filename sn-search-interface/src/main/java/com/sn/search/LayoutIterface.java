package com.sn.search;

import com.sn.pojo.Layout;

import java.util.List;
import java.util.Map;

public interface LayoutIterface {

    /**
     * 返回全部列表
     * @return
     */
    public List<Layout> findAll(Map searchMap);

    /**
     * 返回下级栏目数据
      * @param searchMap
     * @return
     */
    public List<Layout> layoutList(Map searchMap);
}
