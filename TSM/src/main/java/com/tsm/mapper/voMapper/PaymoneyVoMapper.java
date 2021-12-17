package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.entity.Paymoney;
import com.tsm.vo.payMoneyVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */

@Mapper
public interface PaymoneyVoMapper extends BaseMapper<payMoneyVo> {

    @Select("select * from payMoney p left join COURSE c on p.COURSE_ID=c.COURSE_ID left join staff s on p.staff_id=s.staff_id LEFT JOIN STUDENT t on p.student_id=t.student_id")
    public IPage<payMoneyVo> selectPayMoneyVoAll(Page page, Wrapper wrapper);
}
