package com.tsm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsm.entity.Navigation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Set;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 军
 * @since 2021-12-29
 */
@Mapper
public interface NavigationMapper extends BaseMapper<Navigation> {
    @Select("select * from POSITION_NAV pn\n" +
            "left join NAVIGATION n on pn.NAV_ID = n.NAVIGATION_ID\n" +
            "left join POSITION p on pn.POSITION_id=p.POSITION_ID\n" +
            "left join STAFF_POSITION sp on p.POSITION_ID=sp.POSITION_ID \n" +
            "left join STAFF s on sp.staff_id=s.staff_id \n" +
            "where s.staff_id=#{id} and pn.deleted=0 and sp.DELETED=0")
    List<Navigation> selectNavAll(int id);
}
