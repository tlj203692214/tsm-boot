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



@Mapper
public interface FollowVoMapper extends BaseMapper<FollowVo> {

    @Select("select s.studentFiles_id,f.FOLLOW_DATE,sta.STAFF_NAME,c.CHANNEL_LOC,s.STUDENTFILES_NAME,s.STUDENTFILES_SEX,s.STUDENTFILES_AGE,s.STUDENTFILES_PHONE,cou.COURSE_NAME,s.STUDENTFILES_REMARKS,s.STUDENTFILES_STATE from STUDENTFILES s  LEFT JOIN FOLLOW f on f.STUDENTFILES_ID=s.STUDENTFILES_ID LEFT JOIN STAFF sta on f.staff_id=sta.staff_id LEFT JOIN CHANNEL c on s.channel_id=c.channel_id LEFT JOIN COURSE cou on s.course_id=cou.course_id" + " ${ew.customSqlSegment}")
   // IPage<FollowVo> selectfollowvo(Page page, Wrapper wrapper);

    IPage<FollowVo> selectfollowvo(Page page, @Param(Constants.WRAPPER) QueryWrapper<FollowVo> followVoQueryWrapper);

    @Select("select s.studentFiles_id,f.FOLLOW_DATE,sta.STAFF_NAME,c.CHANNEL_LOC,s.STUDENTFILES_NAME,s.STUDENTFILES_SEX,s.STUDENTFILES_AGE,s.STUDENTFILES_PHONE,cou.COURSE_NAME,s.STUDENTFILES_REMARKS,s.STUDENTFILES_STATE from STUDENTFILES s  LEFT JOIN FOLLOW f on f.STUDENTFILES_ID=s.STUDENTFILES_ID LEFT JOIN STAFF sta on f.staff_id=sta.staff_id LEFT JOIN CHANNEL c on s.channel_id=c.channel_id LEFT JOIN COURSE cou on s.course_id=cou.course_id" + " ${ew.customSqlSegment}")
    IPage<FollowVo> selectmohufollowvo(Page page, @Param(Constants.WRAPPER) QueryWrapper<FollowVo> followVoQueryWrapper);
}
