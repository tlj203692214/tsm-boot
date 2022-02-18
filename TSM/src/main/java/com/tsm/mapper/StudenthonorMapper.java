package com.tsm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsm.entity.Studentfiles;
import com.tsm.entity.Studenthonor;
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
public interface StudenthonorMapper extends BaseMapper<Studenthonor> {
    @Update("update studenthonor set deleted=1 where STUDENTHONOR_ID=#{studenthonorId}")
    int updatestudent(Studenthonor studenthonor);
}
