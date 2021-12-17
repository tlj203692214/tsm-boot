package com.tsm.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Expenditure;
import com.tsm.entity.Refund;
import com.tsm.vo.ExpenditureVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IExpenditureService extends IService<Expenditure> {
        public IPage<Expenditure> selectExpenditurePage(int page, int size);

}
