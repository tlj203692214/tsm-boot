package com.tsm.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeTableVo {
    //排课表
    private int teachingId;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date beginDate;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date endTime;
    @TableLogic
    private int deleted;

    //课表
    private int timetableId;                //排课编号
    private String timetableMorning;        //上午课程
    private String timetableAfternoon;      //下午课程
    @JsonFormat(pattern = "HH:mm",timezone = "GMT+8")
    private Date timetableTime;             //上午开始上课时间
    @JsonFormat(pattern = "HH:mm",timezone = "GMT+8")
    private Date timetableMorningend;       //上午结束时间
    @JsonFormat(pattern = "HH:mm",timezone = "GMT+8")
    private Date timetableAfternoonstart;   //下午开始时间
    @JsonFormat(pattern = "HH:mm",timezone = "GMT+8")
    private Date timetableAfternoonend;     //下午结束时间
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date timetableDate;             //课程日期
    private int timetableState;             //课程状态
    private int staffId1;                   //上午任课老师
    private int staffId2;                   //下午任课老师

    //班级
    private int classesId;
    private String classesName;

    //任课老师
    private String staffname1;
    private String staffname2;


}
