package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.vo.AdminVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminVoMapper extends BaseMapper<AdminVo> {
    @Select("select * from administration ad left join personal ps on ad.staff_id = ps.staff_id left join portrait pt \n" +
            " on ps.portrait_id = pt.portrait_id left join position pos on ad.position_id = pos.position_id \n" +
            " left join dept d on ad.dept_id = d.dept_id" + " ${ew.customSqlSegment}")
    public IPage<AdminVo> findsAdmins(Page page, @Param(Constants.WRAPPER) QueryWrapper<AdminVo> adminVoQueryWrapper);//员工管理分页模糊查询

    @Select("select * from administration ad left join personal ps on ad.staff_id = ps.staff_id left join portrait pt \n" +
            " on ps.portrait_id = pt.portrait_id left join position pos on ad.position_id = pos.position_id \n" +
            " left join dept d on ad.dept_id = d.dept_id where administration_id = #{aid} ")
    public AdminVo Admins(@Param("aid") int aid); //员工详情
}
