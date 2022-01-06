package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
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
public interface StaffVoMapper extends BaseMapper<Staff> {
    @Select("select * from STAFF_POSITION sp left join staff s on sp.STAFF_ID = s.STAFF_ID left join POSITION p on " +
            "sp.POSITION_ID = p.POSITION_ID left join DEPT d on p.dept_id = d.DEPT_ID")

    public IPage<Staff> selectAllStaff();

}
