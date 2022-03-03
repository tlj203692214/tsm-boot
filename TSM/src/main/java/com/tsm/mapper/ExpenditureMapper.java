package com.tsm.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.entity.Expenditure;
import com.tsm.entity.Student;
import org.apache.ibatis.annotations.*;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
//@Repository
@Mapper
public interface ExpenditureMapper extends BaseMapper<Expenditure> {
//    校务支出多表分页查询
    @Select("SELECT * FROM expenditure e left JOIN  refund r on e.REFUND_ID=r.REFUND_ID left JOIN PURCHASE p on e.PURCHASE_ID=p.PURCHASE_ID")
    IPage<Expenditure> selectAll(Page page, Wrapper wrapper);

    //查询支出表的最新编号+1
    @Select("SELECT MAX(expenditure_id )+1 FROM EXPENDITURE")
    int selectid();

    //添加校务支出
    @Insert({"insert into expenditure (expenditure_id,expenditure_money ,expenditure_date ,purchase_id) values(#{expenditureId,jdbcType=INTEGER},#{expenditureMoney,jdbcType=INTEGER}," +
            "#{expenditureDate,jdbcType=DATE},#{purchaseId,jdbcType=INTEGER})"})
    //@Options(useGeneratedKeys = true, keyProperty = "expenditureId")
   // @SelectKey(statement = "SELECT MAX(expenditure_id )+1 FROM EXPENDITURE ", keyProperty = "expenditureId", resultType = Integer.class, before = false)
    public int addexpenditure(Expenditure expenditure);

//    @Update("update expenditure set EXPENDITURE_MONEY = #{expenditureMoney,jdbcType=INTEGER} where PURCHASE_ID = #{purchaseId}")
//    int updateexpend(Expenditure expenditure, QueryWrapper<Expenditure> wrapper, @Param("expenditureMoney") Double expenditureMoney, @Param("purchaseId") int purchaseId);

    @Insert({"insert into expenditure (expenditure_id,expenditure_money ,expenditure_date ,refund_id) values(#{expenditureId,jdbcType=INTEGER},#{expenditureMoney,jdbcType=INTEGER}," +
            "#{expenditureDate,jdbcType=DATE},#{refundId,jdbcType=INTEGER})"})
    public int addexpend(Expenditure expenditure);
}
