package com.tsm.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassesVo {
    //班级
    private int classesId;
    private String classesName;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date classesDate;
    private int classesNumber;
    @TableLogic
    private int deleted;
    //教室
    private int classroomId;
    private String classroomName;
    //班主任
    private int staffId;
    private String staffName;
    //课程
    private int courseId;
    private String courseName;
    //学生
    private int studentId;
    private String studentName;
    private String studentSex;
    private int studentAge;
    private String studentPhone;
    private String parentPhone;
    private String studentzh;

    private int teachingId;//排课表编号

    //课表
    private int timetableId;
    private String timetableMorning;//上午课程
    private String timetableAfternoon;//下午课程
    @JsonFormat(pattern = "hh:mm:ss")
    private Date timetableTime;         //上午开始时间
    @JsonFormat(pattern = "hh:mm:ss")
    private Date timetableMorningend;   //上午结束时间
    @JsonFormat(pattern = "hh:mm:ss")
    private Date timetableAfternoonstart; //下午开始时间
    @JsonFormat(pattern = "hh:mm:ss")
    private Date timetableAfternoonend; //下午结束时间
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date timetableDate;         //课程日期
    private int timetableState;         //状态 0：已上，1：未上，默认1）
    private int staffId1;               //上午任课老师
    private int staffId2;               //下午任课老师
    private String staff2;
}
