package com.tsm.vo;
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
    private Date personalBirthday;
    private String personalIdcard;
    private String personalPhone;
    private Date entryTime;
    private int portraitId;
    private String portraitUrl;
    private String staffName;
    private String staffPass;
    private int staffId;
    private int deleted;
}
