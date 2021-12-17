package com.tsm.vo;
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
    @JsonFormat(pattern = "YYYY-MM-dd")
    private LocalDateTime expenditureDate;
    private BigDecimal purchaseId;
    private String purchaseName;
    private int purchaseNumber;
    private Double purchasePrice;
    private BigDecimal purchaseAount;
    private String staffName;

    private int courseId;
    @JsonFormat(pattern = "YYYY-MM-dd")
    private LocalDateTime purchaseDate;
    private int refundId;
    @JsonFormat(pattern = "YYYY-MM-dd")
    private LocalDateTime refundDate;
    private Double refundMoney;
    private BigDecimal refundState;
    private String staffName2;
    private BigDecimal deleted;
}
