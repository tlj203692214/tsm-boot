package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.vo.RefundVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
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
//    @Select("select * from refund r LEFT JOIN LEAVESCHOOL l on r.LEAVESCHOOL_ID = l.LEAVESCHOOL_ID \n" +
//            "LEFT JOIN STUDENT s on l.student_id=s.student_id \n" +
//            "left join CLASSRECORD c on r.classrecord_id=c.classrecord_id \n" +
//            "left join CLASSES cl on c.classes_id =cl.classes_id \n" +
//            "left join COURSE o on r.course_id=o.course_id \n" +
//            "left join STAFF t on r.staff_id=t.staff_id")
//    IPage<RefundVo> selectRefundVoAll(Page page,Wrapper wrapper);

    /**
     * 根据名字模糊查询
     * @return
     */
    @Select("select * from refund r \n" +
            "left join LEAVESCHOOL l on r.leaveSchool_id = l.leaveSchool_id \n" +
            "left join STUDENT s on l.student_id=s.student_id \n" +
            "left join CLASSRECORD c on r.classrecord_id=c.classrecord_id \n" +
            "left join CLASSES cl on c.classes_id =cl.classes_id \n" +
            "left join COURSE o on r.course_id=o.course_id \n" +
            "left join STAFF t on r.staff_id=t.staff_id where s.student_name like'%${name}%' and r.deleted=0")
    public IPage<RefundVo> selectRefundByName(Page page,Wrapper wrapper,@Param("name") String name);

    /**
     * 根据名字和状态查询
     * @param state
     * @param name
     * @return
     */
    @Select("select * from refund r \n" +
            "left join LEAVESCHOOL l on r.leaveSchool_id = l.leaveSchool_id \n" +
            "left join STUDENT s on l.student_id=s.student_id \n" +
            "left join CLASSRECORD c on r.classrecord_id=c.classrecord_id \n" +
            "left join CLASSES cl on c.classes_id =cl.classes_id \n" +
            "left join COURSE o on r.course_id=o.course_id \n" +
            "left join STAFF t on r.staff_id=t.staff_id where r.REFUND_STATE=#{state} and s.student_name like'%${name}%' and r.deleted=0")
    public IPage<RefundVo> selectRefundState(Page page,Wrapper wrapper,@Param("state") int state ,@Param("name") String name);

}
