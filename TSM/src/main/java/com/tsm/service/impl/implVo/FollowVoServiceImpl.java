package com.tsm.service.impl.implVo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Studentfiles;
import com.tsm.mapper.voMapper.FollowVoMapper;
import com.tsm.service.serviceVo.FollowVoService;
import com.tsm.vo.FollowVo;
import freemarker.core.UnknownDateTypeFormattingUnsupportedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class FollowVoServiceImpl extends ServiceImpl<FollowVoMapper, FollowVo> implements FollowVoService {
    @Autowired
    private FollowVoMapper followVoMapper;
    @Override
    public IPage<FollowVo> selectfollowvo(int page, int size) {
        Page<FollowVo> page1=new Page<>(page,size);
        QueryWrapper<FollowVo> queryWrapper=new QueryWrapper();
        queryWrapper.eq("s.DELETED",0);
        queryWrapper.orderByDesc("s.STUDENTFILES_ID");
        IPage<FollowVo>iPage=followVoMapper.selectfollowvo(page1,queryWrapper);
        return iPage;
    }

    @Override
    public IPage<FollowVo> selectmohufollowvo(int page, int size, String name, String qkzt, String lyqd, String yxkc) throws ParseException {
        Page<FollowVo> followVoPage =new Page<>(page,size);
        QueryWrapper queryWrapper=new QueryWrapper();
//        System.out.println(name+qkzt+lyqd+yxkc+sj1+sj2+":数据");
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = sdf.parse(sj1);
//        Date date1 = sdf.parse(sj2);
//        System.out.println(date+" "+date1+":数据");
//        if (sj1!=null&&sj1.length()!=0&&sj2!=null&&sj2.length()!=0){
//            queryWrapper.between("f.FOLLOW_DATE",date,date1); //查询时间段在sj1和sj2之间的数据
//        }else {
//            System.out.println("时间空");
//        }
        if (name!=null&&name.length()!=0){
            queryWrapper.like("s.STUDENTFILES_NAME",name)
            ;
        }else{
            System.out.println("name空");
        }
        if (qkzt!=null&&qkzt.length()!=0){
            queryWrapper.eq("STUDENTFILES_STATE",qkzt)
            ;
        }else{
            System.out.println("qkzt空");
        }

        if (lyqd!=null&&lyqd.length()!=0){
            queryWrapper.eq("c.CHANNEL_ID",lyqd);
        }else{
            System.out.println("lyqd空");
        }
        if (yxkc!=null&&yxkc.length()!=0){
            queryWrapper.eq("cou.COURSE_ID",yxkc);
        }else{
            System.out.println("yxkc空");
        }
        queryWrapper.eq("s.DELETED",0);
        queryWrapper.orderByDesc("s.STUDENTFILES_ID");
        IPage<FollowVo> followVoIPage=followVoMapper.selectmohufollowvo(followVoPage,queryWrapper);

        return followVoIPage;
    }

    @Override
    public IPage<FollowVo> selectxsmohufollowvo(int page, int size, String name, String qkzt, String lyqd, String yxkc, String sfbm) throws ParseException {
        Page<FollowVo> followVoPage =new Page<>(page,size);
        QueryWrapper queryWrapper=new QueryWrapper();
       if(sfbm!=null&&sfbm.length()!=0){
           queryWrapper.orderByDesc("s.STUDENTFILES_ID");
           queryWrapper.eq("s.STUDENTFILES_STATE",3);
          if (name!=null&&name.length()!=0){
              queryWrapper.like("s.STUDENTFILES_NAME",name);
          }
          if (yxkc!=null&&yxkc.length()!=0){
              queryWrapper.eq("cou.COURSE_ID",yxkc);
          }

       }else{
           queryWrapper.ne("s.STUDENTFILES_STATE",3);
           queryWrapper.orderByDesc("s.STUDENTFILES_ID");
           if (name!=null&&name.length()!=0){
               queryWrapper.like("s.STUDENTFILES_NAME",name);
           }
           if (yxkc!=null&&yxkc.length()!=0){
               queryWrapper.eq("cou.COURSE_ID",yxkc);
           }
       }
        queryWrapper.eq("s.DELETED",0);
        queryWrapper.orderByDesc("s.STUDENTFILES_ID");
        IPage<FollowVo> followVoIPage=followVoMapper.selectmohufollowvo(followVoPage,queryWrapper);
        return followVoIPage;
    }

    @Override
    public IPage<FollowVo> selectmohufollowvo1(int page, int size, String name, String qkzt, String lyqd, String yxkc) {
        Page<FollowVo> followVoPage =new Page<>(page,size);
        QueryWrapper queryWrapper=new QueryWrapper();
        List<FollowVo> followVos=new ArrayList<>();
        System.out.println(name+qkzt+lyqd+yxkc+":数据");

        if (qkzt!=null&&qkzt.length()!=0){
            queryWrapper.eq("STUDENTFILES_STATE",qkzt)
            ;
        }else{
            System.out.println("qkzt空");
        }
        if (name!=null&&name.length()!=0){
            queryWrapper.like("s.STUDENTFILES_NAME",name)
            ;
        }else{
            System.out.println("name空");
        }
        if (lyqd!=null&&lyqd.length()!=0){
            queryWrapper.eq("c.CHANNEL_ID",lyqd);
        }else{
            System.out.println("lyqd空");
        }
        if (yxkc!=null&&yxkc.length()!=0){
            queryWrapper.eq("cou.COURSE_ID",yxkc);
        }else{
            System.out.println("yxkc空");
        }
        queryWrapper.eq("s.DELETED",0);
        queryWrapper.orderByDesc("s.STUDENTFILES_ID");
        IPage<FollowVo> followVoIPage=followVoMapper.selectmohufollowvo(followVoPage,queryWrapper);

        return followVoIPage;
    }

    @Override
    public IPage<FollowVo> selectmohufollowvo2(int page, int size, String name, String qkzt, String lyqd, String yxkc) throws ParseException {
        Page<FollowVo> followVoPage =new Page<>(page,size);
        QueryWrapper queryWrapper=new QueryWrapper();
      //  List<FollowVo> followVos=new ArrayList<>();
//        System.out.println(name+qkzt+lyqd+yxkc+sj1+sj2+":数据");
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = sdf.parse(sj1);
//        Date date1 = sdf.parse(sj2);
//        System.out.println(date+" "+date1+":数据");
//        if (sj1!=null&&sj1.length()!=0&&sj2!=null&&sj2.length()!=0){
//            queryWrapper.between("f.FOLLOW_DATE",date,date1); //查询时间段在sj1和sj2之间的数据
//        }else {
//            System.out.println("时间空");
//        }
        if (name!=null&&name.length()!=0){
            queryWrapper.eq("s.PARENT_PHONE",name);

        }else{
            System.out.println("name空");
        }
        if (qkzt!=null&&qkzt.length()!=0){
            queryWrapper.eq("STUDENTFILES_STATE",qkzt)
            ;
        }else{
            System.out.println("qkzt空");
        }

        if (lyqd!=null&&lyqd.length()!=0){
            queryWrapper.eq("c.CHANNEL_ID",lyqd);
        }else{
            System.out.println("lyqd空");
        }
        if (yxkc!=null&&yxkc.length()!=0){
            queryWrapper.eq("cou.COURSE_ID",yxkc);
        }else{
            System.out.println("yxkc空");
        }
        queryWrapper.eq("s.DELETED",0);
        queryWrapper.orderByDesc("s.STUDENTFILES_ID");
        IPage<FollowVo> followVoIPage=followVoMapper.selectmohufollowvo(followVoPage,queryWrapper);

        return followVoIPage;
    }

    @Override
    public IPage<FollowVo> selectmohufollowvo3(int page, int size, String name, String qkzt, String lyqd, String yxkc) {
        Page<FollowVo> followVoPage =new Page<>(page,size);
        QueryWrapper queryWrapper=new QueryWrapper();
        List<FollowVo> followVos=new ArrayList<>();
        System.out.println(name+qkzt+lyqd+yxkc+":数据");

        if (qkzt!=null&&qkzt.length()!=0){
            queryWrapper.eq("STUDENTFILES_STATE",qkzt)
            ;
        }else{
            System.out.println("qkzt空");
        }
        if (name!=null&&name.length()!=0){
            queryWrapper.eq("s.PARENT_PHONE",name);
            ;
        }else{
            System.out.println("name空");
        }
        if (lyqd!=null&&lyqd.length()!=0){
            queryWrapper.eq("c.CHANNEL_ID",lyqd);
        }else{
            System.out.println("lyqd空");
        }
        if (yxkc!=null&&yxkc.length()!=0){
            queryWrapper.eq("cou.COURSE_ID",yxkc);
        }else{
            System.out.println("yxkc空");
        }
        queryWrapper.eq("s.DELETED",0);
        queryWrapper.orderByDesc("s.STUDENTFILES_ID");
        IPage<FollowVo> followVoIPage=followVoMapper.selectmohufollowvo(followVoPage,queryWrapper);

        return followVoIPage;
    }

    @Override
    public List<FollowVo> selectList(String id) {

        QueryWrapper wrapper=new QueryWrapper();
        wrapper.eq("f.FOLLOW_ID",id);
        List<FollowVo> list=followVoMapper.selectfollowvoid(wrapper);
        return list;
    }
}
