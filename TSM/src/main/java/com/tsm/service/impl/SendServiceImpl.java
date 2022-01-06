package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Send;
import com.tsm.mapper.SendMapper;
import com.tsm.service.ISendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.awt.*;

import java.util.List;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ..
 * @since 2021-12-09
 */
@Service
public class SendServiceImpl extends ServiceImpl<SendMapper, Send> implements ISendService {
    @Autowired
    private SendMapper sendMapper;
    @Override
    public Send addsend(Send send) {
        sendMapper.insert(send);
        int id=send.getSendId();
        System.out.println(id);
        Send send1=sendMapper.selectById(id);
        return send1;
    }

    @Override
    public IPage<Send> findAllSend(int page, int size, String name, String js, String input) {
        QueryWrapper<Send> wrapper=new QueryWrapper<>();
        wrapper.eq("DELETED",0)
                .eq("STAFF_NAME1",name);

        if(js.equals("标题")){
            wrapper.inSql("SEND_TITLE", "select SEND_TITLE from SEND where SEND_TITLE like '%" +input+ "%'");
        }else {
            wrapper.inSql("STAFF_NAME2", "select STAFF_NAME2 from SEND where STAFF_NAME2 like '%" +input+ "%'");
        }
        Page<Send> page1=new Page<>(page,size);
        IPage<Send> sendIPage = sendMapper.selectPage(page1, wrapper);
        return sendIPage;
    }

    @Override
    public int delectSend(Send send) {

        Integer integer=sendMapper.updateById(send);
        return integer;
    }
}
