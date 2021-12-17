package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.vo.RefundVo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Repository
public interface RefundVoMapper extends BaseMapper<RefundVo> {
    @Select("select * from refund r LEFT JOIN LEAVESCHOOL l on r.LEAVESCHOOL_ID = l.LEAVESCHOOL_ID \n" +
            "LEFT JOIN STUDENT s on l.student_id=s.student_id \n" +
            "left join CLASSRECORD c on r.classrecord_id=c.classrecord_id \n" +
            "left join CLASSES cl on c.classes_id =cl.classes_id \n" +
            "left join COURSE o on r.course_id=o.course_id \n" +
            "left join STAFF t on r.staff_id=t.staff_id")
    IPage<RefundVo> selectRefundVoAll(Page page,Wrapper wrapper);

}
