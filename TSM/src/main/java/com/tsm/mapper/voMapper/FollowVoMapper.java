package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.vo.FollowVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface FollowVoMapper extends BaseMapper<FollowVo> {

    @Select("select  * from STUDENTFILES s  LEFT JOIN CHANNEL c on s.channel_id=c.channel_id LEFT JOIN COURSE cou on s.course_id=cou.course_id " + " ${ew.customSqlSegment}")
   // IPage<FollowVo> selectfollowvo(Page page, Wrapper wrapper);

    IPage<FollowVo> selectfollowvo(Page page, @Param(Constants.WRAPPER) QueryWrapper<FollowVo> followVoQueryWrapper);

    @Select("select  * from STUDENTFILES s  LEFT JOIN CHANNEL c on s.channel_id=c.channel_id LEFT JOIN COURSE cou on s.course_id=cou.course_id " + " ${ew.customSqlSegment}")
    IPage<FollowVo> selectmohufollowvo(Page page, @Param(Constants.WRAPPER) QueryWrapper<FollowVo> followVoQueryWrapper);

    @Select("select  * from STUDENTFILES s  LEFT JOIN CHANNEL c on s.channel_id=c.channel_id LEFT JOIN COURSE cou on s.course_id=cou.course_id " + " ${ew.customSqlSegment}")
    List<FollowVo> selectfollowvoid(@Param(Constants.WRAPPER) QueryWrapper<FollowVo> followVoQueryWrapper);

}
