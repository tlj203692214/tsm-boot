package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.vo.GraduationVo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface GraduationVoMapper extends BaseMapper<GraduationVo> {
    @Select("select * from graduation gra LEFT JOIN student sta on gra.STUDENT_ID=sta.STUDENT_ID LEFT JOIN COURSE cou " +
            "on gra.COURSE_ID=cou.COURSE_ID LEFT JOIN classes cla on sta.CLASSES_ID=cla.CLASSES_ID" + " ${ew.customSqlSegment} ")
    IPage<GraduationVo> selectPayMoneyVo(Page page, @Param(Constants.WRAPPER) QueryWrapper<GraduationVo> queryWrapper);
}
