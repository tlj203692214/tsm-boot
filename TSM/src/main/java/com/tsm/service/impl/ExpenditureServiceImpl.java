package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Expenditure;
import com.tsm.mapper.ExpenditureMapper;
import com.tsm.mapper.RefundMapper;
import com.tsm.service.IExpenditureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Service
public class ExpenditureServiceImpl extends ServiceImpl<ExpenditureMapper, Expenditure> implements IExpenditureService {
    @Autowired
    private RefundMapper refundMapper;
    @Autowired
    private ExpenditureMapper expenditureMapper;

    @Override
    public Date selectMinDate() {
        return expenditureMapper.selectMinDate();
    }

    /**
     * 校务支出多表分页查询
     * @param page
     * @param size
     * @return
     */

    @Override
    public IPage<Expenditure> selectExpenditurePage(int page, int size) {
        Page<Expenditure> page1 = new Page<>(page,size);
        IPage<Expenditure> expenditureIPage = expenditureMapper.selectAll(page1, null);
        return expenditureIPage;
    }

    @Override
    public int insertExpendForRefund(Expenditure expenditure) {
        int id = expenditureMapper.selectid();
        expenditure.setExpenditureId(id);
        return expenditureMapper.insertExpendRefund(expenditure);
    }

//    @Override
//    public int addexpenditure(Expenditure expenditure) {
//        int a=expenditureMapper.addexpenditure(expenditure);
//        return a;
//    }


}
