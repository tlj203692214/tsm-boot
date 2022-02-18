package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.vo.FollowVo;
import com.tsm.vo.TransferrecordVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TransferrecordVoMapper extends BaseMapper<TransferrecordVo> {
    @Select(
            "select tr.TRANSFERRECORD_ID,sta.STUDENT_ID,tr.TRANSFERRECORD_DATE,tr.TRANSFERRECORD_REASON,sta.STUDENT_NAME,c.CLASSES_NAME,cl.CLASSES_NAME as CLASSES_NAME1 ,tr.deleted from  TRANSFERRECORD tr  LEFT JOIN STUDENT sta on tr.STUDENT_ID=sta.STUDENT_ID LEFT JOIN CLASSES c on tr.CLASSES_ONE=c.CLASSES_ID LEFT JOIN CLASSES cl  on tr.CLASSES_TWO=cl.CLASSES_ID" + " ${ew.customSqlSegment}")
    List<TransferrecordVo> selectfollowvo(@Param(Constants.WRAPPER) QueryWrapper<TransferrecordVo> followVoQueryWrapper);
}
