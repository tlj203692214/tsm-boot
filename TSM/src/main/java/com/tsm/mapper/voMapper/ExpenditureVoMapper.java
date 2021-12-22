package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.vo.ExpenditureVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ExpenditureVoMapper extends BaseMapper<ExpenditureVo> {
    @Select("SELECT * FROM expenditure e \n" +
            "left JOIN  refund r on e.REFUND_ID=r.REFUND_ID \n" +
            "left join COURSE c2 on r.course_id = c2.course_id\n" +
            "left join staff s2 on r.staff_id = s2.staff_id\n" +
            "left JOIN PURCHASE p on e.PURCHASE_ID=p.PURCHASE_ID \n" +
            "left join staff s on p.staff_id=s.staff_id \n" +
            "left join COURSE c on p.course_id=c.course_id \n" +
            "left join LEAVESCHOOL l on r.LEAVESCHOOL_id = l.LEAVESCHOOL_id\n" +
            "left join STUDENT t on l.student_id=t.student_id where e.deleted = #{delete}")
    IPage<ExpenditureVo> sel(Page page, Wrapper wrapper,int delete);


}
