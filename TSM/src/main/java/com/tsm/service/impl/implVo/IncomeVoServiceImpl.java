package com.tsm.service.impl.implVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.mapper.voMapper.IncomeVoMapper;
import com.tsm.service.serviceVo.IncomeVoService;
import com.tsm.vo.IncomeVo;
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
public class IncomeVoServiceImpl extends ServiceImpl<IncomeVoMapper, IncomeVo> implements IncomeVoService {
    @Autowired
    private IncomeVoMapper incomeVoMapper;

    /**
     * 收入分页查询
     */
    @Override
    public IPage<IncomeVo> selectIncomeVo(int page, int size,String name,String payMode) {
        Page<IncomeVo> page1 = new Page<>(page,size);
        if(payMode.equals("全部支付")){
            return incomeVoMapper.selectIncomeVo(page1,null, name);
        }else{
            return incomeVoMapper.selectIncomeVoByPayMode(page1,null,name,payMode);
        }


    }
}
