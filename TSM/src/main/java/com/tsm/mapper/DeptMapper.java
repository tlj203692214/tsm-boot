package com.tsm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsm.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Mapper
@Repository
public interface DeptMapper extends BaseMapper<Dept> {

}
