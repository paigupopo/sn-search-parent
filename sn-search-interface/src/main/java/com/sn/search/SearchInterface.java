package com.sn.search;


import java.util.List;
import java.util.Map;

public interface SearchInterface {


    /**
     * 执行搜索
     * @param searchMap
     * @return
     */
     public Map search(Map searchMap);

    /**
     * logo设置
     * @param groupId
     * @return
     */

    String selectLogo(Long groupId);


    List<String> getCategoryName(String cateGoryFlag);

    List<Map<String, String>> getTop();

}
