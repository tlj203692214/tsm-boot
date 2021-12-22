package com.tsm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IncomeVo {
    private BigDecimal incomeId;
    private BigDecimal incomeState;
    private BigDecimal paymoneyMoney;
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private LocalDateTime paymoneyDate;
    private String paymoneyMode;
    private String staffName;
    private String studentName;
    private BigDecimal deleted;
}
