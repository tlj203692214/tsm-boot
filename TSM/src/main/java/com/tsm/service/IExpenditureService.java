package com.tsm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Expenditure;

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
