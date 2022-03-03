package com.tsm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Leaveschool;
import com.tsm.mapper.LeaveschoolMapper;
import com.tsm.service.ILeaveschoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Service
public class LeaveschoolServiceImpl extends ServiceImpl<LeaveschoolMapper, Leaveschool> implements ILeaveschoolService {
@Autowired
    private LeaveschoolMapper mapper;

    @Override
    public int addleaveschool(Leaveschool leaveschool) {
        int a=mapper.insert(leaveschool);
        return a;
    }

    @Override
    public int selectid() {
        int a=mapper.selectid();
        return a;
    }
}
