package com.sn.mapper;

import com.sn.pojo.WzqPolls;
import com.sn.pojo.WzqPollsExample;

import java.util.List;

public interface WzqPollsMapper {

    List<WzqPolls> selectByExample(WzqPollsExample example);

    List selectWpList();


}