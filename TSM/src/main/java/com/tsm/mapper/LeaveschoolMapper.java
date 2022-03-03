package com.tsm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsm.entity.Leaveschool;
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
public interface LeaveschoolMapper extends BaseMapper<Leaveschool> {
@Select("select max(LEAVESCHOOL_ID) from Leaveschool")
    public int selectid();
}
