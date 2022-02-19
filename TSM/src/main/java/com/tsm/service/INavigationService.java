package com.tsm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Navigation;

import java.util.List;
import java.util.Set;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-29
 */
public interface INavigationService extends IService<Navigation> {
        public List<Navigation> selectAll(int id);
//        查询所有的权限
        IPage<Navigation> selectNavAll(int page,int size,String navName);
//        新增权限
        int insertNav(Navigation navigation);
        List<Navigation> selectPid();
//        修改权限
        int updateNav(Navigation navigation);
//        删除权限的方法
        int deleteNav(int id);
}
