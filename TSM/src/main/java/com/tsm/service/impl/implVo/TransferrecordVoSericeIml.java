package com.tsm.service.impl.implVo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Transferrecord;
import com.tsm.mapper.voMapper.FollowVoMapper;
import com.tsm.mapper.voMapper.TransferrecordVoMapper;
import com.tsm.service.serviceVo.FollowVoService;
import com.tsm.service.serviceVo.ITransferrecordVoService;
import com.tsm.vo.FollowVo;
import com.tsm.vo.TransferrecordVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferrecordVoSericeIml extends ServiceImpl<TransferrecordVoMapper, TransferrecordVo> implements ITransferrecordVoService {
   @Autowired
   private TransferrecordVoMapper mapper;
    @Override
    public List<TransferrecordVo> selectlist(int id) {
        QueryWrapper<TransferrecordVo> wrapper=new QueryWrapper<>();
        wrapper.eq("sta.STUDENT_ID",id);
        wrapper.orderByDesc("tr.TRANSFERRECORD_ID");
        List<TransferrecordVo> list=mapper.selectfollowvo(wrapper);
        return list;
    }
}
