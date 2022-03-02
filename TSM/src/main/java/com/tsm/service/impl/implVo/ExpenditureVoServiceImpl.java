package com.tsm.service.impl.implVo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.mapper.RefundMapper;
import com.tsm.mapper.voMapper.ExpenditureVoMapper;
import com.tsm.service.serviceVo.IExpenditureVoService;
import com.tsm.vo.ExpenditureVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Service
public class ExpenditureVoServiceImpl extends ServiceImpl<ExpenditureVoMapper, ExpenditureVo> implements IExpenditureVoService {
    @Autowired
    private ExpenditureVoMapper expenditureMapper;



    /**
     * 校务支出多表分页查询
     */
    @Override
    public IPage<ExpenditureVo> selectExpenditurePage(int page, int size) {
        Page<ExpenditureVo> page1 = new Page<>(page, size);
        QueryWrapper<ExpenditureVo> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("EXPENDITURE_ID");
        IPage<ExpenditureVo> expenditureIPage = expenditureMapper.sel(page1, queryWrapper);
        return expenditureIPage;
    }

    /*
     * 校务支出统计金额查询
     * */
    @Override
    public double countMoney() {
        List<ExpenditureVo> expenditureVos = expenditureMapper.selectExpenditure(null);
        int a = expenditureMapper.countMoney();
        double money = 0;
        for (int i = 0; i < a; i++) {
            money = money + expenditureVos.get(i).getExpenditureMoney();
        }
        return money;
    }

    /**
     * 根据时间查询校务支出
     */
    @Override
    public IPage<ExpenditureVo> selectExpendByDate(int page, int size, String startTime, String endTime) throws ParseException {
        Page<ExpenditureVo> page1 = new Page<>(page, size);
        System.out.println(startTime + "时间到" + endTime);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        QueryWrapper<ExpenditureVo> queryWrapper = new QueryWrapper<>();
        Date date = simpleDateFormat.parse(startTime);
        Date date2 = simpleDateFormat.parse(endTime);
        queryWrapper.between("e.EXPENDITURE_DATE", date, date2);
        return expenditureMapper.sel(page1, queryWrapper);

    }


}
