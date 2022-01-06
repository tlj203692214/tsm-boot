package com.tsm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsm.entity.Studentfiles;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
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
public interface StudentfilesMapper extends BaseMapper<Studentfiles> {
  //  update tb_user set name=#{name},sex=#{sex} where id=#{id}
@Update("update studentfiles set deleted=1 where STUDENTFILES_ID=#{studentfilesId}")
     int updatestudent(Studentfiles studentfiles);
}
