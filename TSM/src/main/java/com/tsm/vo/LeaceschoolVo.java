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
public class LeaceschoolVo {
    //退学申请表
    private int leaveschoolId;                      //退学申请编号
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date leaveschoolDate;                   //退学时间
    private String leaveschoolReason;               //退学原因
    @TableLogic
    private int deleted;

    //退费表
    private int refundId;           //退费编号
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date refundDate;        //退费时间
    private Double refundMoney;        //退费金额
    private int refundState;            //退费状态


    //学生表
    @TableId(value = "STUDENT_ID",type = IdType.INPUT)
    private int studentId;              //学生编号
    private String studentName;         //学生姓名
    private String studentSex;          //性别
    private int studentAge;             //年龄
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date studentBirthday;       //出生日期
    private String studentPhone;        //学生电话
    private String parentPhone;         //家长电话
    private String studentSchool;       //毕业学校
    private String studentLoc;          //学生住址

    //课程
    private int courseId;
    private String courseName;

    //
    private int staffId;
    private String staffName;
}
