package com.tsm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Expenditure;

import java.util.Date;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IExpenditureService extends IService<Expenditure> {
        /**
         * 查询最早的支出时间
         */
        public Date selectMinDate();

        public IPage<Expenditure> selectExpenditurePage(int page, int size);

        //添加校务支出表
//        public int addexpenditure(Expenditure expenditure);

//        校务支出退费添加
        public int insertExpendForRefund(Expenditure expenditure);
}
