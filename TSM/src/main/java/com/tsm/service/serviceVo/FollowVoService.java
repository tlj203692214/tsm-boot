package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.vo.FollowVo;

import java.text.ParseException;

public interface FollowVoService extends IService<FollowVo> {
    //分页查询
    public IPage<FollowVo> selectfollowvo(int page, int size);

    //模糊分页查询有时间、学生姓名
    public IPage<FollowVo> selectmohufollowvo(int page,int size,String name,String qkzt,String lyqd,String yxkc,String gjr,String sj1,String sj2) throws ParseException;

    //模糊分页查询没有时间有学生姓名
    public IPage<FollowVo> selectmohufollowvo1(int page,int size,String name,String qkzt,String lyqd,String yxkc,String gjr);

    //模糊分页查询有时间、家长电话
    public IPage<FollowVo> selectmohufollowvo2(int page,int size,String name,String qkzt,String lyqd,String yxkc,String gjr,String sj1,String sj2) throws ParseException;

    //模糊分页查询没有时间有家长电话
    public IPage<FollowVo> selectmohufollowvo3(int page,int size,String name,String qkzt,String lyqd,String yxkc,String gjr);
}
