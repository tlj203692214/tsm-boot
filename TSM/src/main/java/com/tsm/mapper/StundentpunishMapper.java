package com.tsm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsm.entity.Studenttalk;
import com.tsm.entity.Stundentpunish;
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
public interface StundentpunishMapper extends BaseMapper<Stundentpunish> {
    @Update("update Stundentpunish set deleted=1 where STUNDENTPUNISH_ID=#{stundentpunishId}")
    int updatestudent(Stundentpunish stundentpunish);
}
