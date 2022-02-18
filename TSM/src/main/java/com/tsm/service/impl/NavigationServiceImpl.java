package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Navigation;
import com.tsm.mapper.NavigationMapper;
import com.tsm.service.INavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

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
    public List<Navigation> selectAll(int id) {
        return navigationMapper.selectNavAll(id);
    }

    @Override
    public IPage<Navigation> selectNavAll(int page, int size,String navName) {
        Page<Navigation> page1 = new Page<>(page,size);
        QueryWrapper<Navigation> queryWrapper =new QueryWrapper<>();
        queryWrapper.orderByAsc("NAVIGATION_ID");
        queryWrapper.like("NAVIGATION_NAME",navName);
        return navigationMapper.selectPage(page1,queryWrapper);
    }

    @Override
    public int insertNav(Navigation navigation) {
        return navigationMapper.insert(navigation);
    }

    @Override
    public List<Navigation> selectPid() {
        QueryWrapper<Navigation> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("NAVIGATION_PID",0);
        List<Navigation> navigations = navigationMapper.selectList(queryWrapper);
        return navigations;
    }

    @Override
    public int updateNav(Navigation navigation) {
        return navigationMapper.updateById(navigation);
    }

    @Override
    public int deleteNav(int id) {
        Navigation navigation = navigationMapper.selectById(id);
        navigation.setDeleted(1);
        return navigationMapper.deleteById(navigation);
    }

}
