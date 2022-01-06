package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.vo.FollowVo;
import com.tsm.vo.StudnetVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentVoMapper extends BaseMapper<StudnetVo> {
    @Select("select * from STUDENT s LEFT JOIN CLASSES c on s.classes_id=c.CLASSES_ID" + " ${ew.customSqlSegment}")
    public IPage<StudnetVo> ipage(Page page, @Param(Constants.WRAPPER) QueryWrapper<StudnetVo> followVoQueryWrapper);

    @Select("select * from STUDENT s LEFT JOIN CLASSES c on s.classes_id=c.CLASSES_ID" + " ${ew.customSqlSegment}")
    public IPage<StudnetVo> mohustudent(Page page, @Param(Constants.WRAPPER) QueryWrapper<StudnetVo> followVoQueryWrapper);
}
