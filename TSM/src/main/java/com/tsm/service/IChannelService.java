package com.tsm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Channel;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IChannelService extends IService<Channel> {
    //分页查询
    public IPage<Channel> fycxchannel(int page,int size);
    //模糊分页查询
    public IPage<Channel> ancxchannel(int page,int size,String channelLoc);
    //渠道新增
    public int addchannel(Channel channel);
    //渠道修改
    public int update(Channel channel);
    //渠道删除
    public int delect(Channel channel);
    //渠道名称查询
    public List<Channel> select();
}
