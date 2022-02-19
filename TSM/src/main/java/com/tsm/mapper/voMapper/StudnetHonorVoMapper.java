package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.vo.StudentHonorVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudnetHonorVoMapper extends BaseMapper<StudentHonorVo> {
    @Select("select * from STUDENTHONOR stu LEFT JOIN STUDENT sta on stu.STUDENT_ID=sta.STUDENT_ID LEFT JOIN CLASSES cl on sta.CLASSES_ID=cl.CLASSES_ID" + " ${ew.customSqlSegment}")
    IPage<StudentHonorVo> selectfollowvo(Page page, @Param(Constants.WRAPPER) QueryWrapper<StudentHonorVo> followVoQueryWrapper);

    @Select("select * from STUDENTTALK stu LEFT JOIN STUDENT sta on stu.STUDENT_ID=sta.STUDENT_ID LEFT JOIN STAFF st on stu.STAFF_ID=st.STAFF_ID" + " ${ew.customSqlSegment}")
    IPage<StudentHonorVo> selectStudentalk(Page page, @Param(Constants.WRAPPER) QueryWrapper<StudentHonorVo> followVoQueryWrapper);


    @Select("select * from STUNDENTPUNISH stu LEFT JOIN STUDENT sta on stu.STUDENT_ID=sta.STUDENT_ID" + " ${ew.customSqlSegment}")
    IPage<StudentHonorVo> selectStudentPunish(Page page, @Param(Constants.WRAPPER) QueryWrapper<StudentHonorVo> followVoQueryWrapper);

}
