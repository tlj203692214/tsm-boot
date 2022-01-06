package com.tsm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Follow;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IFollowService extends IService<Follow> {
    //添加跟进
public int addfollow(Follow follow);
    //查询跟进记录
    public List<Follow> selectfollow(int id);
}
