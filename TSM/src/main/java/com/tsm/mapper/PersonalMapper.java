package com.tsm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.entity.Personal;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.sql.Wrapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Repository
public interface PersonalMapper extends BaseMapper<Personal> {
    //使用逻辑删除时，需要手写的sql
    @Select("select * from personal where deleted = 2 and personal_name like '%${name}%'")
    public IPage<Personal> personalPage(Wrapper wrapper, @Param("name") String name , Page page);
}
