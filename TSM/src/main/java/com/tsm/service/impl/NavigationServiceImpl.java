package com.tsm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Navigation;
import com.tsm.mapper.NavigationMapper;
import com.tsm.service.INavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-29
 */
@Service
public class NavigationServiceImpl extends ServiceImpl<NavigationMapper, Navigation> implements INavigationService {
    @Autowired
    private NavigationMapper navigationMapper;

    @Override
    public List<Navigation> selectAll() {
        return navigationMapper.selectList(null);
    }
}
