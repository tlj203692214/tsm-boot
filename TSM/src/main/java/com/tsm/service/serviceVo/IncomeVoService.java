package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Income;
import com.tsm.vo.IncomeVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IncomeVoService extends IService<IncomeVo> {
    /**
     * 收入分页查询
     */
    public IPage<IncomeVo> selectIncomeVo(int page,int size);

}
