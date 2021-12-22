package com.tsm.vo;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor//有参方法
@NoArgsConstructor//无参方法
public class ExpenditureVo {
    private int expenditureId;
    private Double expenditureMoney;
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private LocalDateTime expenditureDate;
    private BigDecimal purchaseId;
    private String purchaseName;
    private int purchaseNumber;
    private Double purchasePrice;
    private BigDecimal purchaseAount;
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private LocalDateTime purchaseDate;
    private String staffName;
    private String studentName;
    private int refundId;
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private LocalDateTime refundDate;
    private Double refundMoney;
    private BigDecimal refundState;
    private int courseId;
    private String courseName;
    private Double courseMoney;
    private Double courseHour;
    private Double coursePrice;
    private Double bookFee;
    @TableField("DELETED")
    private BigDecimal deleted;
}
