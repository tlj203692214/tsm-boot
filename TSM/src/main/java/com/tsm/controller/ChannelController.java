package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.entity.Channel;
import com.tsm.service.IChannelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@RestController
@Slf4j
@CrossOrigin(maxAge = 60)
public class ChannelController {

    @Autowired
    private IChannelService iChannelService;
//分页查询
    @GetMapping("/selectchannel")
    public IPage<Channel> selectchannelfy(@RequestParam("currentPage") int page,@RequestParam("size") int size){
        IPage<Channel> channelIPage=iChannelService.fycxchannel(page, size);
        return channelIPage;
    }
//模糊查询分页
    @GetMapping("/anselectchannel")
    public IPage<Channel> anselectfy(@RequestParam("currentPage") int page,@RequestParam("size") int size,@RequestParam("shoushuokuan")String channelLoc){
        IPage<Channel> channelIPage=iChannelService.ancxchannel(page, size, channelLoc);
        return channelIPage;
    }
//新增渠道
    @PostMapping("/addchannel")
    public int annchanel1(@RequestBody Channel channel){
        int a=iChannelService.addchannel(channel);
        return a;
    }
    //修改渠道
    @PostMapping("updatechannel")
    public int updatedatachannel1(@RequestBody Channel channel){
        int a=iChannelService.update(channel);
        return a;
    }
    //删除渠道
    @PostMapping("delectchannel")
    public int delectchannel1(@RequestBody Channel channel){
        int a=iChannelService.delect(channel);
        return a;
    }

    //查询渠道名称
    @GetMapping("selectchannelname")
    public List<Channel> selectchannelname1(){
        List<Channel> channels=iChannelService.select();
        return channels;
    }
}
