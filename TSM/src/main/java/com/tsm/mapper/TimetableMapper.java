package com.tsm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsm.entity.Timetable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Mapper
public interface TimetableMapper extends BaseMapper<Timetable> {
    @Update("update Timetable set deleted=1 where TIMETABLE_ID = #{timetableId}")
    public int deletedtim(Timetable timetable);

    @Update("update Timetable set TIMETABLE_STATE=1 where TIMETABLE_ID = #{timetableId}")
    public int deletedtimzt(Timetable timetable);
}
