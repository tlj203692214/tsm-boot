package com.tsm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Position;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IPositionService extends IService<Position> {
        public IPage<Position> selectPosition(int size,int page,String name);
//        查询所有的角色
        List<Position> selectPositionAll();
//        添加角色
        int insertPosition(Position position);
//        修改角色的方法
        int updatePosition(Position position);
}
