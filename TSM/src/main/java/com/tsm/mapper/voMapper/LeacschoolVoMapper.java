package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.vo.LeaceschoolVo;
import com.tsm.vo.PurchaseVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LeacschoolVoMapper extends BaseMapper<LeaceschoolVo> {
    @Select("select * from refund ref LEFT JOIN LEAVESCHOOL lea on ref.LEAVESCHOOL_ID=lea.LEAVESCHOOL_ID " +
            "LEFT JOIN COURSE cou on ref.COURSE_ID=cou.COURSE_ID LEFT JOIN STAFF sta on ref.STAFF_ID=sta.STAFF_ID " +
            "LEFT JOIN STUDENT stu on lea.STUDENT_ID=stu.STUDENT_ID" + " ${ew.customSqlSegment}")
    public IPage<LeaceschoolVo> selectpage(Page page, @Param(Constants.WRAPPER) QueryWrapper<LeaceschoolVo> followVoQueryWrapper);
}
