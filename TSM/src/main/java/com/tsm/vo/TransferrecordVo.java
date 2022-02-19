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
public class TransferrecordVo {
    private int transferrecordId;
    private int studentId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date transferrecordDate;
    private String transferrecordReason;
    private String studentName;
    private String classesName;
    private String classesName1;
    @TableLogic
    private int deleted;
}
