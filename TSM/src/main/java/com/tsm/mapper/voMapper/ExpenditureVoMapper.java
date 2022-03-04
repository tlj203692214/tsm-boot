package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.vo.ExpenditureVo;
import com.tsm.vo.RefundVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

@Mapper
public interface ExpenditureVoMapper extends BaseMapper<ExpenditureVo> {


    /**
     * 查询所有校务支出的数据
     */
    @Select("SELECT * FROM expenditure e \n" +
            "left JOIN  refund r on e.REFUND_ID=r.REFUND_ID \n" +
            "left join COURSE c2 on r.course_id = c2.course_id\n" +
            "left join staff s2 on r.staff_id = s2.staff_id\n" +
            "left JOIN PURCHASE p on e.PURCHASE_ID=p.PURCHASE_ID \n" +
            "left join staff s on p.staff_id=s.staff_id \n" +
            "left join COURSE c on p.course_id=c.course_id \n" +
            "left join LEAVESCHOOL l on r.LEAVESCHOOL_id = l.LEAVESCHOOL_id\n" +
            "left join STUDENT t on l.student_id=t.student_id" + " ${ew.customSqlSegment}")
    IPage<ExpenditureVo> sel(Page<ExpenditureVo> page, @Param(Constants.WRAPPER) QueryWrapper<ExpenditureVo> queryWrapper);

    /**
     * 统计所有校务支出的数据
     */
    @Select("SELECT count(*) FROM expenditure e \n" +
            "left JOIN  refund r on e.REFUND_ID=r.REFUND_ID \n" +
            "left join COURSE c2 on r.course_id = c2.course_id\n" +
            "left join staff s2 on r.staff_id = s2.staff_id\n" +
            "left JOIN PURCHASE p on e.PURCHASE_ID=p.PURCHASE_ID \n" +
            "left join staff s on p.staff_id=s.staff_id \n" +
            "left join COURSE c on p.course_id=c.course_id \n" +
            "left join LEAVESCHOOL l on r.LEAVESCHOOL_id = l.LEAVESCHOOL_id\n" +
            "left join STUDENT t on l.student_id=t.student_id order by e.expenditure_id desc")
    public int countMoney();

    /**
     * 查询所有校务支出的数据
     */
    @Select("SELECT * FROM expenditure e \n" +
            "left JOIN  refund r on e.REFUND_ID=r.REFUND_ID \n" +
            "left join COURSE c2 on r.course_id = c2.course_id\n" +
            "left join staff s2 on r.staff_id = s2.staff_id\n" +
            "left JOIN PURCHASE p on e.PURCHASE_ID=p.PURCHASE_ID \n" +
            "left join staff s on p.staff_id=s.staff_id \n" +
            "left join COURSE c on p.course_id=c.course_id \n" +
            "left join LEAVESCHOOL l on r.LEAVESCHOOL_id = l.LEAVESCHOOL_id\n" +
            "left join STUDENT t on l.student_id=t.student_id order by e.expenditure_id desc" + " ${ew.customSqlSegment}")
    List<ExpenditureVo> selectExpenditure(@Param(Constants.WRAPPER) QueryWrapper<ExpenditureVo> queryWrapper);


}
