package com.sn.search.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sn.search.SearchInterface;
import com.sn.search.SearchNameInterface;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/sn")
public class SNSearchController {

    @Reference
    private SearchInterface itemSearchService;


    @Reference
    private SearchNameInterface searchNameInterface;


    /**
     * 遂宁搜索
     *
     * @param searchMap
     * @return
     */

    @RequestMapping("/search")
    public Map search(@RequestBody Map searchMap) {
        return itemSearchService.search(searchMap);
    }

    /**
     * logo设置
     *
     * @param groupId
     * @return
     */

    @RequestMapping("/selectLogo")
    public String selectLogo(Long groupId) {
        return itemSearchService.selectLogo(groupId);
    }

    /**
     * 搜索推荐数据
     *
     * @param searchMap
     * @return
     */
    @RequestMapping("/searchName")
    public Map searchName(@RequestBody Map searchMap) {

        return searchNameInterface.searchName(searchMap);
    }

    @RequestMapping("/getCategoryName")
    public List<String> getCategoryName(String cateGoryFlag) {
        List<String> res = itemSearchService.getCategoryName(cateGoryFlag);
        return res;
    }

    @RequestMapping("/getTop")
    public List<Map<String, String>> getTop(String cateGoryFlag) {
        List<Map<String, String>> res = itemSearchService.getTop();
        return res;
    }
}
