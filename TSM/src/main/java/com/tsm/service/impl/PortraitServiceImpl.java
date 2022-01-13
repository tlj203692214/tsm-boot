package com.tsm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Portrait;
import com.tsm.mapper.PortraitMapper;
import com.tsm.service.IPortraitService;
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
public class PortraitServiceImpl extends ServiceImpl<PortraitMapper, Portrait> implements IPortraitService {
    @Autowired
    private PortraitMapper portraitMapper;
    @Override
    public int updatePortrait(Portrait portrait) {
        return portraitMapper.updateById(portrait);
    }

    @Override
    public Portrait selectPortrait(int id) {
        return portraitMapper.selectById(id);
    }
}
