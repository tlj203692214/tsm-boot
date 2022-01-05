package com.tsm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Navigation;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-29
 */
public interface INavigationService extends IService<Navigation> {
        public List<Navigation> selectAll();
}
