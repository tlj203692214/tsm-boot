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

/**
 * <p>
 *  服务实现类
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
     * @param page
     * @param size
     * @return
     */

    @Override
    public IPage<ExpenditureVo> selectExpenditurePage(int page, int size) {
        Page<ExpenditureVo> page1 = new Page<>(page,size);

        IPage<ExpenditureVo> expenditureIPage = expenditureMapper.sel(page1, null);
        return expenditureIPage;
    }



}
