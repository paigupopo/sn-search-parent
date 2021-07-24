package com.sn.mapper;

import com.sn.pojo.CmsGovernmenthotsiterm;
import com.sn.pojo.CmsGovernmenthotsitermExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsGovernmenthotsitermMapper {
    long countByExample(CmsGovernmenthotsitermExample example);

    int deleteByExample(CmsGovernmenthotsitermExample example);

    int deleteByPrimaryKey(Long itemid);

    int insert(CmsGovernmenthotsiterm record);

    int insertSelective(CmsGovernmenthotsiterm record);

    List<CmsGovernmenthotsiterm> selectByExample(CmsGovernmenthotsitermExample example);

    CmsGovernmenthotsiterm selectByPrimaryKey(Long itemid);

    int updateByExampleSelective(@Param("record") CmsGovernmenthotsiterm record, @Param("example") CmsGovernmenthotsitermExample example);

    int updateByExample(@Param("record") CmsGovernmenthotsiterm record, @Param("example") CmsGovernmenthotsitermExample example);

    int updateByPrimaryKeySelective(CmsGovernmenthotsiterm record);

    int updateByPrimaryKey(CmsGovernmenthotsiterm record);

    Long selectcount();


    /**
     * 查询搜索数据集合
     * @return
     */
    List selectAddress();

    /**
     * 访问量
     * @return
     */
    Long selectItem();

    /**
     * 本月搜索量
     * @return
     */
    Long thisMonth();

    /**
     * 上月搜索量
     * @return
     */
    Long lastMonth();

    /**
     * 本月访问量
     * @return
     */
    Long thisMonthCount();

    /**
     * 上月访问量
     * @return
     */
    Long lastMonthCount();

    /**
     * 计算每个月数据
     * @return
     */
    List selectMonth(String day);

    /**
     * 每个省份的搜素量
     * @return
     */
    List selectCity();


    List selectAddressCount();

    /**
     * 查看当前用户
     * @param o
     * @return
     */
    List govHotIP(Object o);



}