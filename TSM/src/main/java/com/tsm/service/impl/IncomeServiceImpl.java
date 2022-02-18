package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Income;
import com.tsm.mapper.IncomeMapper;
import com.tsm.service.IIncomeService;
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
public class IncomeServiceImpl extends ServiceImpl<IncomeMapper, Income> implements IIncomeService {
    @Autowired
    private IncomeMapper incomeMapper;

    @Override
    public Long IncomeCount(int zt) {
        QueryWrapper<Income> wrapper = new QueryWrapper<>();
        wrapper.eq("DELETED",zt);
        Long count = incomeMapper.selectCount(wrapper);
        return count;
    }
}
