package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.vo.FollowVo;

public interface FollowVoService extends IService<FollowVo> {
    //分页查询
    public IPage<FollowVo> selectfollowvo(int page, int size);

    //模糊分页查询
    public IPage<FollowVo> selectmohufollowvo(int page,int size,String name,String qkzt,String lyqd,String yxkc,String gjr);

}
