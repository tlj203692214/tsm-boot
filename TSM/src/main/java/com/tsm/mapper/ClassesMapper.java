package com.tsm.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.entity.Classes;
import com.tsm.entity.Student;
import com.tsm.vo.GraduationVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
public interface ClassesMapper extends BaseMapper<Classes> {
    @Select("select * from CLASSES" + " ${ew.customSqlSegment} ")
    public IPage<Classes> selecclassestlist(Page page, @Param(Constants.WRAPPER) QueryWrapper<Classes> queryWrapper);

    @Update("update Classes set deleted=1 where CLASSES_ID = #{classesId}")
    int updateclasses(Classes classes);
}
