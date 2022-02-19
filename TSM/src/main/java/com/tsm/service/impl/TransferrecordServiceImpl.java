package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Transferrecord;
import com.tsm.mapper.TransferrecordMapper;
import com.tsm.service.ITransferrecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class TransferrecordServiceImpl extends ServiceImpl<TransferrecordMapper, Transferrecord> implements ITransferrecordService {

    @Autowired
    public TransferrecordMapper transferrecordMapper;
    @Override
    public int addItrans(Transferrecord transferrecord) {
        int a=transferrecordMapper.insert(transferrecord);
        return a;
    }

}
