package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsm.entity.PositionMenu;
import com.tsm.vo.positionNavVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Mapper
@Repository
public interface PositionNavVoMapper extends BaseMapper<positionNavVo> {
    @Select("select navigation_id from POSITION_NAV pn \n" +
            "left join NAVIGATION n on pn.NAV_ID = n.NAVIGATION_ID \n" +
            "LEFT JOIN POSITION p on pn.POSITION_ID = p.position_id \n" +
            "where p.POSITION_ID = #{id} ")
    public int[] selectNavByPositionId(int id);

}
