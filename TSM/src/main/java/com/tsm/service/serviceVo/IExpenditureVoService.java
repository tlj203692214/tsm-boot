package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.vo.ExpenditureVo;

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
}
