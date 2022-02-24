package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.vo.PurchaseVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PurchaseVoMapper extends BaseMapper<PurchaseVo> {
    @Select("select * from PURCHASE pur LEFT JOIN STAFF sta on pur.STAFF_ID=sta.STAFF_ID LEFT JOIN" +
            " COURSE cou on pur.COURSE_ID=cou.COURSE_ID" + " ${ew.customSqlSegment}")
    public IPage<PurchaseVo> selectpurchase(Page page, @Param(Constants.WRAPPER) QueryWrapper<PurchaseVo> followVoQueryWrapper);
}
