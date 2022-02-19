package com.tsm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Stundentpunish;
import com.tsm.mapper.StundentpunishMapper;
import com.tsm.service.IStundentpunishService;
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
public class StundentpunishServiceImpl extends ServiceImpl<StundentpunishMapper, Stundentpunish> implements IStundentpunishService {
    @Autowired
    private StundentpunishMapper mapper;
    @Override
    public int addstudentpun(Stundentpunish stundentpunish) {
        int a=mapper.insert(stundentpunish);
        return a;
    }

    @Override
    public int delectstudentpun(Stundentpunish stundentpunish) {
        int a=mapper.updatestudent(stundentpunish);
        return a;
    }
}
