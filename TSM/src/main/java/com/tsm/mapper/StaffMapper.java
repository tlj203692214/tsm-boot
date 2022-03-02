package com.tsm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsm.entity.Staff;
import com.tsm.vo.personalVo;
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
            "select * from DEPT d left join ADMINISTRATION a on d.DEPT_ID=a.DEPT_ID  LEFT JOIN STAFF s on a.staff_id=s.staff_id where d.dept_Id=#{id} and s.staff_Name like '%${name}%' "
    )
    public List<Staff> selectStaff(@Param("id") int  deptId , @Param("name") String staffName);

}
