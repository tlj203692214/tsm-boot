package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Channel;
import com.tsm.mapper.ChannelMapper;
import com.tsm.service.IChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Service
public class ChannelServiceImpl extends ServiceImpl<ChannelMapper, Channel> implements IChannelService {

    @Autowired
    private  ChannelMapper channelMapper;

    @Override
    public IPage<Channel> fycxchannel(int page, int size) {
        Page<Channel> page1=new Page<>(page,size);
        QueryWrapper<Channel> wrapper=new QueryWrapper<>();
        wrapper.eq("DELETED",0);
        wrapper.orderByDesc("CHANNEL_ID");
        IPage<Channel> channelIPage=channelMapper.selectPage(page1,wrapper);
        return channelIPage;
    }

    @Override
    public IPage<Channel> ancxchannel(int page, int size, String channelLoc) {
        Page<Channel> page1=new Page<>(page,size);
        QueryWrapper<Channel> wrapper = new QueryWrapper<>();
        wrapper.eq("DELETED",0);
        wrapper
               .like("CHANNEL_LOC",channelLoc).orderByDesc("CHANNEL_ID")
        ;
        IPage<Channel> channelIPage=channelMapper.selectPage(page1,wrapper);
        return channelIPage;
    }

    @Override
    public int addchannel(Channel channel) {
        int a=channelMapper.insert(channel);
        return a;
    }

    @Override
    public int update(Channel channel) {
        int a=channelMapper.updateById(channel);
        return a;
    }

    @Override
    public int delect(Channel channel) {
        return channelMapper.deleteById(channel);
    }

    @Override
    public List<Channel> select() {
        return channelMapper.selectList(null);
    }
}
