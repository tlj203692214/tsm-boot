package com.tsm.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="GraduationVo对象", description="")
public class GraduationVo {

    private int graduationId;//学员毕业编号
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date graduationDate;//学生毕业时间
    private int studentId;//学生编号
    private int courseId;//课程编号
    @TableLogic
    private int deleted;//逻辑删除

    private String courseName;//课程名称
    private String studentName;//学生姓名
    private String studentSex;//学生性别
    private int studentAge;//学生年龄
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date studentBirthday;//出生日期
    private String studentPhone;//学生电话
    private String parentPhone;//家长电话
    private String studentLoc;//学生住址
    private String studentSchool;//毕业学校
    private String classesName;//班级名称
}
