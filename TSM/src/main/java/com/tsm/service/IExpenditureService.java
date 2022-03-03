package com.tsm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Expenditure;
import org.springframework.web.bind.annotation.RequestParam;

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

        //添加校务支出表
        public int addexpenditure(Expenditure expenditure);

        //退学添加支出表
        public int addexpend(Expenditure expenditure);
        //修改支出表价格
        public int updateexpend(Expenditure expenditure);
}
