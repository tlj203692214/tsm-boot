package com.tsm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsm.entity.Dept;
import com.tsm.entity.Staff;
import org.apache.ibatis.annotations.Mapper;
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
@Mapper
@Repository
public interface DeptMapper extends BaseMapper<Dept> {
    @Select(
            "select * from DEPT d left join ADMINISTRATION a on d.DEPT_ID=a.DEPT_ID  LEFT JOIN STAFF s on a.staff_id=s.staff_id where s.staff_Id=#{id}"
    )
//     "select * from DEPT d left join ADMINISTRATION a on d.DEPT_ID=a.DEPT_ID  LEFT JOIN STAFF s on a.staff_id=s.staff_id
    public List<Dept> selectDept(@Param("id") int staffId);
}
