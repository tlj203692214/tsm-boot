package com.tsm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.PositionNav;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2022-02-14
 */
public interface IPositionNavService extends IService<PositionNav> {
        public int insertPosAndNav(PositionNav positionNav);
        List<PositionNav> selectPosAndNav();
}
