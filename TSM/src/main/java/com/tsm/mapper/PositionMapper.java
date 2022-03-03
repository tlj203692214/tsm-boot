package com.tsm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsm.entity.Position;
import com.tsm.vo.personalVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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
public interface PositionMapper extends BaseMapper<Position> {
    @Select(
            "select * from PORTRAIT  p left join PERSONAL e on p.PORTRAIT_ID=e.PORTRAIT_ID left join STAFF s on s.STAFF_ID=e.STAFF_ID where s.staff_id=#{id}"
    )
    public List<personalVo> selectPersonalVo(int id);
}
