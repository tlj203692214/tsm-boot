package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.vo.payMoneyVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */

@Mapper
public interface PaymoneyVoMapper extends BaseMapper<payMoneyVo> {
    /**
     * 财务：报班缴费模糊查询
     */
    @Select("select * from PAYMONEY p \n" +
            "left join COURSE c on p.COURSE_ID=c.COURSE_ID\n" +
            "left join STAFF s on p.staff_id=s.staff_id\n" +
            "LEFT JOIN studentFiles st on p.studentFiles_id=st.studentFiles_id"
            + " ${ew.customSqlSegment}")
      IPage<payMoneyVo> selectPayMoneyVo(Page page, @Param(Constants.WRAPPER)QueryWrapper<payMoneyVo> queryWrapper);
    /**
     * 统计方法
     */
    @Select("select count(*) from PAYMONEY p \n" +
            "left join COURSE c on p.COURSE_ID=c.COURSE_ID\n" +
            "left join STAFF s on p.staff_id=s.staff_id\n" +
            "LEFT JOIN studentFiles st on p.studentFiles_id=st.studentFiles_id where p.deleted=0")
    public int countMoney();

    /**
     * 查询全部方法
     * @return
     */
    @Select("select * from PAYMONEY p \n" +
            "left join COURSE c on p.COURSE_ID=c.COURSE_ID\n" +
            "left join STAFF s on p.staff_id=s.staff_id\n" +
            "LEFT JOIN studentFiles st on p.studentFiles_id=st.studentFiles_id where p.deleted=0 order by p.paymoney_id desc")
    public List<payMoneyVo> selectAllMoney();
    /*
  * 根据已到账的状态统计数据
     */
    @Select("select count(*) from PAYMONEY p \n" +
            "left join COURSE c on p.COURSE_ID=c.COURSE_ID\n" +
            "left join STAFF s on p.staff_id=s.staff_id\n" +
            "LEFT JOIN studentFiles st on p.studentFiles_id=st.studentFiles_id where p.paymoney_state=0 and p.deleted=0")
    public int countMoneyByState();
    /**
     * 根据状态查询全部方法
     */
    @Select("select * from PAYMONEY p \n" +
            "left join COURSE c on p.COURSE_ID=c.COURSE_ID\n" +
            "left join STAFF s on p.staff_id=s.staff_id\n" +
            "LEFT JOIN studentFiles st on p.studentFiles_id=st.studentFiles_id where p.paymoney_state=0 and p.deleted=0")
    List<payMoneyVo> selectAllByState();

    /*
     * 根据未到账的状态统计数据
     */
    @Select("select count(*) from PAYMONEY p \n" +
            "left join COURSE c on p.COURSE_ID=c.COURSE_ID\n" +
            "left join STAFF s on p.staff_id=s.staff_id\n" +
            "LEFT JOIN studentFiles st on p.studentFiles_id=st.studentFiles_id where p.paymoney_state=1 and p.deleted=0")
    public int countMoneyByState2();
    /**
     * 根据状态查询全部方法
     */
    @Select("select * from PAYMONEY p \n" +
            "left join COURSE c on p.COURSE_ID=c.COURSE_ID\n" +
            "left join STAFF s on p.staff_id=s.staff_id\n" +
            "LEFT JOIN studentFiles st on p.studentFiles_id=st.studentFiles_id where p.paymoney_state=1 and p.deleted=0")
    List<payMoneyVo> selectAllByState2();


}
