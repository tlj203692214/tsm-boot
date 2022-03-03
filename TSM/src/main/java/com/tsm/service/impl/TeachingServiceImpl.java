package com.tsm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Teaching;
import com.tsm.mapper.TeachingMapper;
import com.tsm.service.ITeachingService;
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
public class TeachingServiceImpl extends ServiceImpl<TeachingMapper, Teaching> implements ITeachingService {
@Autowired
private TeachingMapper mapper;
    @Override
    public int addteaching(Teaching teaching) {
        int a=mapper.insert(teaching);
        return a;
    }

    @Override
    public int selectmax() {
        int a=mapper.selectmax();
        return a;
    }
}
