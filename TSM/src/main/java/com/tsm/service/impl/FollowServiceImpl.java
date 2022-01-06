package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Follow;
import com.tsm.mapper.FollowMapper;
import com.tsm.service.IFollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Service
public class FollowServiceImpl extends ServiceImpl<FollowMapper, Follow> implements IFollowService {
    @Autowired
    private FollowMapper followMapper;
    @Override
    public int addfollow(Follow follow) {
        int a =followMapper.insert(follow);
        return a;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Follow> selectfollow(int id) {
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("STUDENTFILES_ID",id);
        List<Follow> list=followMapper.selectList(queryWrapper);
        return list;
    }
}
