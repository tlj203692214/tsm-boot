package com.tsm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsm.entity.Staff;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Repository
public interface StaffMapper extends BaseMapper<Staff> {
    @Select(
            "select * from DEPT d left join POSITION p on d.DEPT_ID=p.DEPT_ID left join STAFF_POSITION s_p on s_p.POSITION_ID=p.POSITION_ID LEFT JOIN STAFF s on s_p.staff_id=s.staff_id where d.dept_Id=#{id} and s.staff_Name like '%${name}%' "
    )
    public List<Staff> selectStaff(@Param("id") int deptId , @Param("name") String staffName);
}
