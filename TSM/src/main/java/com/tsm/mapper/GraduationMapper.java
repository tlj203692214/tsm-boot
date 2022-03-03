package com.tsm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsm.entity.Graduation;
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
public interface GraduationMapper extends BaseMapper<Graduation> {

@Update("update Graduation set deleted=1 where GRADUATION_ID= #{graduationId}")
    public int updatezt(Graduation graduation);
}
