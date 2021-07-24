package com.sn.search;



import com.sn.entity.PageResult;
import com.sn.pojo.CmsGovernmenthots;

import java.util.List;

/**
 * 服务层接口
 */
public interface GovernmenthotsService {

    /**
     * 返回全部列表
     * @return
     */
    public List<CmsGovernmenthots> findAll();


    /**
     * 返回分页列表
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize);


    /**
     * 增加
     */
    public void add(CmsGovernmenthots governmenthots);



    /**
     * 根据ID获取实体
     * @param id
     * @return
     */
    public CmsGovernmenthots findOne(Long id);


    /**
     * 批量删除
     * @param ids
     */
    public void delete(Long[] ids);

    /**
     * 热词
     * @return
     */
    List selectName();

    /**
     * 根据用户ip获取搜索记录数据
     * @param aLong
     * @return
     */
    List GovHotIp(Object aLong);




}
