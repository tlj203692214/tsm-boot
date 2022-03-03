package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.vo.TimeTableVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface TimeTableVoMapper extends BaseMapper<TimeTableVo> {
    @Select("select st.STAFF_NAME staffname1,sta.STAFF_NAME staffname2,tim.TIMETABLE_ID,tim.TIMETABLE_MORNING," +
            "tim.TIMETABLE_AFTERNOON,tim.TIMETABLE_TIME,tim.TIMETABLE_MORNINGEND,tim.TIMETABLE_AFTERNOONSTART," +
            "tim.TIMETABLE_AFTERNOONEND,tim.TIMETABLE_DATE,tim.TIMETABLE_STATE,tim.STAFF_ID1,tim.STAFF_ID2,tea.TEACHING_ID," +
            "tea.BEGIN_DATE,tea.END_TIME,tim.DELETED,cla.CLASSES_ID,cla.CLASSES_NAME from TIMETABLE tim " +
            "LEFT JOIN TEACHING tea on tim.TEACHING_ID=tea.TEACHING_ID LEFT JOIN CLASSES cla on " +
            "tea.CLASSES_ID=cla.CLASSES_ID LEFT JOIN STAFF st on tim.STAFF_ID1=st.STAFF_ID LEFT JOIN STAFF sta on tim.STAFF_ID2=sta.STAFF_ID" + " ${ew.customSqlSegment}")
    public IPage<TimeTableVo> selectTimeTableVo(Page page, @Param(Constants.WRAPPER)QueryWrapper<TimeTableVo> wrapper);

    @Select("select st.STAFF_NAME staffname1,sta.STAFF_NAME staffname2,tim.TIMETABLE_ID,tim.TIMETABLE_MORNING," +
            "tim.TIMETABLE_AFTERNOON,tim.TIMETABLE_TIME,tim.TIMETABLE_MORNINGEND,tim.TIMETABLE_AFTERNOONSTART," +
            "tim.TIMETABLE_AFTERNOONEND,tim.TIMETABLE_DATE,tim.TIMETABLE_STATE,tim.STAFF_ID1,tim.STAFF_ID2,tea.TEACHING_ID," +
            "tea.BEGIN_DATE,tea.END_TIME,tim.DELETED,cla.CLASSES_ID,cla.CLASSES_NAME from TIMETABLE tim " +
            "LEFT JOIN TEACHING tea on tim.TEACHING_ID=tea.TEACHING_ID LEFT JOIN CLASSES cla on " +
            "tea.CLASSES_ID=cla.CLASSES_ID LEFT JOIN STAFF st on tim.STAFF_ID1=st.STAFF_ID LEFT JOIN STAFF sta on tim.STAFF_ID2=sta.STAFF_ID" + " ${ew.customSqlSegment}")
    public List<TimeTableVo> selectTimeTableVolist(@Param(Constants.WRAPPER)QueryWrapper<TimeTableVo> wrapper);
}
