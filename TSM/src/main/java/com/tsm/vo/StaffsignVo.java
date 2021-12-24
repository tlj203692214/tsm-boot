package com.tsm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class StaffsignVo {
    private BigDecimal signId;
    private Integer signState;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date signDate;
    private BigDecimal staffId;
    private String personalName;
}
