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
public class PurchaseVo {

    private int purchaseId;
    private String purchaseName;
    private int purchaseNumber;
    private Double purchasePrice;
    private Double purchaseAount;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date purchaseDate;
    @TableLogic
    private int deleted;


    private int staffId;
    private String staffName;

    private int courseId;
    private String courseName;
}
