package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.vo.StaffleaveVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffleaveVoMapper extends BaseMapper<StaffleaveVo> {
    @Select("select * from staffleave sl left join personal ps on sl.STAFF_ID1 = ps.STAFF_ID left join personal p " +
            "on sl.STAFF_ID2 = p.STAFF_ID" + " ${ew.customSqlSegment}" + " order by LEAVE_ID desc")//员工请假分页模糊查询
    public IPage<StaffleaveVo> findleaveVo(Page page, @Param(Constants.WRAPPER) QueryWrapper<StaffleaveVo> adminVoQueryWrapper);
}
