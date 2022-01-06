package com.tsm.vo;

import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="FollowVo对象", description="")
public class FollowVo {
    private int studentfilesId;//意向学员编号
    private String staffName;//员工名称跟进人
    private String channelLoc;//渠道地址
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime followDate;//跟进时间
    private String studentfilesName;//学生姓名
    private String studentfilesSex;//学生性别
    private BigDecimal studentfilesAge;//学生年龄
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date studentfilesBirthday;//学生出生年月
    private Long studentfilesPhone;//联系电话
    private Long parentPhone;//家长联系电话
    private String studentfilesSchool;//毕业学习
    private String studentfilesLoc;//地址
    private String courseName;//课程名字
    private String studentfilesRemarks;//备注
    private BigDecimal studentfilesState;//状态
    private Long followId;//跟进编号
    private Long courseId; //课程编号
    private Long channelid; //渠道编号
    private int deleted;//逻辑删除
}
