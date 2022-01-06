package com.tsm.vo;

import com.baomidou.mybatisplus.annotation.TableField;
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
@ApiModel(value="StudentVo对象", description="")
public class StudnetVo {
    private int studentId;
    private String studentName;
    private String studentSex;
    private int studentAge;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date studentBirthday;
    private Long studentPhone;
    private Long parentPhone;
    private String studentSchool;
    private String studentLoc;
    private int classesId;
    private String classesName;
    private int deleted;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date studententrance;//入学时间


}
