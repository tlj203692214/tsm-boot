package com.tsm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsm.entity.StaffPosition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Mapper
public interface StaffPositionMapper extends BaseMapper<StaffPosition> {
    @Select("select p.position_id from staff_position sp \n" +
            "left join staff s on sp.STAFF_ID = s.STAFF_ID \n" +
            "left join POSITION p on sp.position_id = p.position_id\n" +
            "where s.STAFF_ID = #{id}")
    public int[] selectPositionByStaffId(int id);
}
