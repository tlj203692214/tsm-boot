package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.tsm.vo.FollowVo;
import com.tsm.vo.StaffPositionVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StaffPositionVoMapper extends BaseMapper<StaffPositionVo> {
    @Select("select * from staff_position s LEFT JOIN STAFF sta on s.staff_id=sta.STAFF_ID" + " ${ew.customSqlSegment}")
    List<StaffPositionVo> selectList(@Param(Constants.WRAPPER) QueryWrapper<FollowVo> followVoQueryWrapper);
}
