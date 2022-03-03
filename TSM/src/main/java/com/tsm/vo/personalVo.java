package com.tsm.vo;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class personalVo {
    private int personalId;
    private String personalName;
    private String personalSex;
    private int personalAge;
    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date personalBirthday;
    private String personalIdcard;
    private String personalPhone;
    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date entryTime;
    private int portraitId;
    private String portraitUrl;
    private String staffName;
    private String staffPass;
    private int staffId;
    private int deleted;
}
