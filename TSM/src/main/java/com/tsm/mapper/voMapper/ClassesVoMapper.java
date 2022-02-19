package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.vo.ClassesVo;
import com.tsm.vo.FollowVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ClassesVoMapper extends BaseMapper<ClassesVo> {
    @Select("select cou.COURSE_ID,cla.CLASSES_NUMBER,cla.CLASSES_ID,cla.CLASSES_NAME,rom.CLASSROOM_ID,rom.CLASSROOM_NAME,sta.STAFF_ID,sta.STAFF_NAME,COUNT(stu.CLASSES_ID) studentzh," +
            "cla.CLASSES_DATE,cou.COURSE_NAME from CLASSES cla LEFT JOIN CLASSROOM rom on cla.CLASSROOM_ID=rom.CLASSROOM_ID" +
            " LEFT JOIN STAFF sta on cla.STAFF_ID=sta.STAFF_ID LEFT JOIN COURSE cou on cla.COURSE_ID=cou.COURSE_ID LEFT JOIN" +
            " STUDENT stu on cla.CLASSES_ID=stu.CLASSES_ID WHERE cla.DELETED=0 GROUP BY  cla.CLASSES_ID,cla.CLASSES_NAME,rom.CLASSROOM_NAME," +
            "sta.STAFF_NAME,cla.CLASSES_DATE,cou.COURSE_NAME,rom.CLASSROOM_ID, cou.COURSE_ID,sta.STAFF_ID,cla.CLASSES_NUMBER " + " ${ew.customSqlSegment}")
    public IPage<ClassesVo> selectClassesVo(Page page, @Param(Constants.WRAPPER) QueryWrapper<ClassesVo> followVoQueryWrapper);

    @Select("select cou.COURSE_ID,cla.CLASSES_NUMBER,cla.CLASSES_ID,cla.CLASSES_NAME,rom.CLASSROOM_ID,rom.CLASSROOM_NAME,sta.STAFF_ID,sta.STAFF_NAME,COUNT(stu.CLASSES_ID) studentzh," +
            "cla.CLASSES_DATE,cou.COURSE_NAME from CLASSES cla LEFT JOIN CLASSROOM rom on cla.CLASSROOM_ID=rom.CLASSROOM_ID" +
            " LEFT JOIN STAFF sta on cla.STAFF_ID=sta.STAFF_ID LEFT JOIN COURSE cou on cla.COURSE_ID=cou.COURSE_ID LEFT JOIN" +
            " STUDENT stu on cla.CLASSES_ID=stu.CLASSES_ID " + " ${ew.customSqlSegment}")
    public IPage<ClassesVo> selectClassesmhVo(Page page, @Param(Constants.WRAPPER) QueryWrapper<ClassesVo> followVoQueryWrapper);

    @Select("select * from STUDENT sta LEFT JOIN  CLASSES cla  on cla.CLASSES_ID=sta.CLASSES_ID" + " ${ew.customSqlSegment}")
    public IPage<ClassesVo> selectstudentVo(Page page, @Param(Constants.WRAPPER) QueryWrapper<ClassesVo> followVoQueryWrapper);

    @Select("select cla.CLASSES_ID,tim.TIMETABLE_ID,tim.TIMETABLE_MORNING,tim.TIMETABLE_AFTERNOON,tim.TIMETABLE_TIME,tim.TIMETABLE_MORNINGEND," +
            "tim.TIMETABLE_AFTERNOONSTART,tim.TIMETABLE_AFTERNOONEND,tim.TIMETABLE_DATE,tim.TIMETABLE_STATE,tim.STAFF_ID1," +
            "tim.STAFF_ID2,tim.DELETED,sta.STAFF_NAME,sta2.STAFF_NAME as staff2 from TIMETABLE tim LEFT JOIN TEACHING tea on" +
            " tea.TEACHING_ID=tim.teaching_id LEFT JOIN CLASSES cla on tea.CLASSES_ID =cla.CLASSES_ID LEFT JOIN STAFF sta on " +
            "tim.STAFF_ID1=sta.STAFF_ID LEFT JOIN STAFF sta2 on tim.STAFF_ID2=sta2.STAFF_ID" + " ${ew.customSqlSegment}")
    public IPage<ClassesVo> selectkebioaVo(Page page, @Param(Constants.WRAPPER) QueryWrapper<ClassesVo> followVoQueryWrapper);
}
