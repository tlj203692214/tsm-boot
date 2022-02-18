package com.tsm.vo;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentHonorVo {
    //荣誉
    private int studenthonorId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date studenthonorDate;
    private String studenthonorContent;
    private int studentId;
    private String studentName;
    private String classesName;
    //谈话
    private int studenttalkId;
    private String studenttalkContent;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date studenttalkDate;
    private int staffId;
    private String staffName;
    //处分
    private int stundentpunishId;
    private int stundentpunishGrade;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date stundentpunishDate;
    private String stundentpunishReason;

    @TableLogic
    private int deleted;
}
