package com.tsm.service.impl;

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

    /**
     * 根据id修改审批状态
     * @param id
     * @return
     */
    @Override
    public int updateState(int id) {
        Income income = incomeMapper.selectById(id);
        income.setIncomeState(0);
        int i = incomeMapper.updateById(income);
        return i;
    }
}
