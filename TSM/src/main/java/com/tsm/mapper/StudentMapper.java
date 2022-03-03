package com.tsm.mapper;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsm.entity.Student;
import com.tsm.entity.Studenttalk;
import com.tsm.entity.Stundentpunish;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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
public interface StudentMapper extends BaseMapper<Student> {
    @Update("update student  set CLASSES_ID = #{classesId,jdbcType=INTEGER}" +
            "where student_id = #{studentid}")
    int updateSysRoleById(Student student, UpdateWrapper<Student> wrapper, @Param("classesId") Long classesId,@Param("studentid") int studentid);

    @Update("update Student set deleted=1,CLASSES_ID=#{classesId,jdbcType=INTEGER}  where STUDENT_ID = #{studentId}")
    int updatestudent(Student student);




}
