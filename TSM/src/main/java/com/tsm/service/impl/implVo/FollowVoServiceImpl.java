package com.tsm.service.impl.implVo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.mapper.voMapper.FollowVoMapper;
import com.tsm.service.serviceVo.FollowVoService;
import com.tsm.vo.FollowVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FollowVoServiceImpl extends ServiceImpl<FollowVoMapper, FollowVo> implements FollowVoService {
    @Autowired
    private FollowVoMapper followVoMapper;
    @Override
    public IPage<FollowVo> selectfollowvo(int page, int size) {
        Page<FollowVo> page1=new Page<>(page,size);
        QueryWrapper<FollowVo> queryWrapper=new QueryWrapper();

        queryWrapper.orderByDesc("FOLLOW_ID");
        IPage<FollowVo>iPage=followVoMapper.selectfollowvo(page1,queryWrapper);
        return iPage;
    }



    @Override
    public IPage<FollowVo> selectmohufollowvo(int page, int size, String name, String qkzt, String lyqd, String yxkc, String gjr) {
        Page<FollowVo> followVoPage =new Page<>(page,size);
        QueryWrapper queryWrapper=new QueryWrapper();
        List<FollowVo> followVos=new ArrayList<>();
        System.out.println(name+qkzt+lyqd+yxkc+gjr+":数据");
//        if (qkzt==null){
//
//        }
//            if (qkzt==0){
//                queryWrapper.like("STUDENTFILES_STATE",qkzt);
//            }

        return null;
    }
}
