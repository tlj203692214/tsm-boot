package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.vo.StaffsignVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.sql.Wrapper;

@Repository
public interface StaffsignVoMapper extends BaseMapper<StaffsignVo> {
    @Select("select * from satffsign s LEFT JOIN personal p on p.STAFF_ID=s.STAFF_ID where p.personal_name like '%${name}%'")
    public IPage<StaffsignVo> findStaffsign(Wrapper wrapper, @Param("name") String name ,Page page);
}
