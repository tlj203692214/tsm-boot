package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.vo.IncomeVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface IncomeVoMapper extends BaseMapper<IncomeVo> {
    @Select("select * from PAYMONEY p LEFT JOIN INCOME i on p.PAYMONEY_ID =i.PAYMONEY_ID LEFT JOIN STAFF s on p.staff_id = s.staff_id left join STUDENT t on p.student_id = t.student_id")
     IPage<IncomeVo> selectIncomeVo(Page page, Wrapper wrapper);
}
