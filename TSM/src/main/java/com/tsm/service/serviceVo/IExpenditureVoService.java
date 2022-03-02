package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.vo.ExpenditureVo;

import java.text.ParseException;
import java.util.Date;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IExpenditureVoService extends IService<ExpenditureVo> {


        public IPage<ExpenditureVo> selectExpenditurePage(int page, int size);

//        统计校务支出金额
        public double countMoney();

//        根据时间查询校务支出
        IPage<ExpenditureVo> selectExpendByDate(int page,int size,String startTime,String endTime) throws ParseException;
}
