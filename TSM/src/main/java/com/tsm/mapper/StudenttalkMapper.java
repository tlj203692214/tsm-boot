package com.tsm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsm.entity.Studenthonor;
import com.tsm.entity.Studenttalk;
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
public interface StudenttalkMapper extends BaseMapper<Studenttalk> {
    @Update("update studenttalk set deleted=1 where STUDENTTALK_ID=#{studenttalkId}")
    int updatestudent(Studenttalk studenttalk);
}
