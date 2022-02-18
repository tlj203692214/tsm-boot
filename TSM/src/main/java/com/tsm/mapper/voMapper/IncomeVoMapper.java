package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.vo.IncomeVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestParam;


@Mapper
public interface IncomeVoMapper extends BaseMapper<IncomeVo> {
    @Select("select * from PAYMONEY p \n" +
            "left join COURSE c on p.COURSE_ID=c.COURSE_ID\n" +
            "left join STAFF s on p.staff_id=s.staff_id\n" +
            "LEFT JOIN studentFiles st on p.studentFiles_id=st.studentFiles_id " +
            "where st.studentFiles_name like'%${stuName}%' and p.deleted=0 and p.paymoney_state=0 order by p.paymoney_Id desc")
     IPage<IncomeVo> selectIncomeVo(Page page,@Param("stuName") String name);


    @Select("select * from PAYMONEY p \n" +
            "left join COURSE c on p.COURSE_ID=c.COURSE_ID\n" +
            "left join STAFF s on p.staff_id=s.staff_id\n" +
            "LEFT JOIN studentFiles st on p.studentFiles_id=st.studentFiles_id" +
            "where st.studentFiles_name like'%${name}%' and p.payMoney_mode=#{money} and p.deleted=0 and p.paymoney_state=0 order by p.paymoney_Id desc")
    IPage<IncomeVo> selectIncomeVoByPayMode(Page page,@Param("name") String name,@Param("money") String money);
}
