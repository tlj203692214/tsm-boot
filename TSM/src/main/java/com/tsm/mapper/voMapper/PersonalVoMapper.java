package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsm.entity.Personal;
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
public interface PersonalVoMapper extends BaseMapper<personalVo> {
    @Select("select por.PORTRAIT_URL from personal per left join PORTRAIT por on per.PORTRAIT_ID=por.PORTRAIT_ID left join staff s on per.staff_id = s.staff_id where s.staff_id=#{id}")
    public personalVo selectPicture(int id);

    @Select(
            "select * from PORTRAIT  p left join PERSONAL e on p.PORTRAIT_ID=e.PORTRAIT_ID left join STAFF s on s.STAFF_ID=e.STAFF_ID where s.staff_id=#{id}"
    )
    public List<personalVo> selectPersonalVo(int id);
}
