package com.tsm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Outwarehouse;
import com.tsm.mapper.OutwarehouseMapper;
import com.tsm.service.IOutwarehouseService;
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
public class OutwarehouseServiceImpl extends ServiceImpl<OutwarehouseMapper, Outwarehouse> implements IOutwarehouseService {
    @Autowired
    private OutwarehouseMapper mapper;

    @Override
    public int addoutwar(Outwarehouse outwarehouse) {
        int a=mapper.insert(outwarehouse);
        return a;
    }

    @Override
    public int updateoutwar(Outwarehouse outwarehouse) {
       int a=mapper.updateoutwar(outwarehouse,outwarehouse.getOutwarehouseNumber(),outwarehouse.getOutwarehouseId());
        return a;
    }
}
