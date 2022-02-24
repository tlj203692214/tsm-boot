package com.tsm.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.entity.Expenditure;
import com.tsm.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
    //添加校务支出
    @Insert("insert into Expenditure (expenditureMoney,purchaseId,refundId) values(#{EXPENDITURE_MONEY,jdbcType=INTEGER}," +
            "#{EXPENDITURE_DATE,jdbcType=DATE},#{PURCHASE_ID,jdbcType=INTEGER},#{REFUND_ID,jdbcType=INTEGER})")
    public int addexpenditure(Expenditure expenditure, @Param("expenditureMoney") Double expenditureMoney,@Param("purchaseId") int purchaseId,@Param("refundId") int refundId);

}
