package com.tsm.mapper.voMapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.entity.Dept;
import com.tsm.vo.StaffVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Repository
public interface StaffVoMapper extends BaseMapper<StaffVo> {
    @Select("select sp.STAFFPOSITION_ID,sp.DELETED as spDel,s.STAFF_ID,s.STAFF_NAME,s.STAFF_STATE,p.POSITION_ID,p.POSITION_NAME,p.POSITION_REMARK,p.POSITION_CREATED,p.POSITION_UPDATED,p.POSITION_STATE,d.DEPT_ID,d.DEPT_NAME,per.PERSONAL_ID,per.PERSONAL_NAME,per.PERSONAL_AGE,per.PERSONAL_SEX,per.PERSONAL_BIRTHDAY,per.PERSONAL_IDCARD,per.PERSONAL_PHONE,per.ENTRY_TIME,per.PERSONAL_STATE\n" +
            "from staff s\n" +
            "left join STAFF_POSITION sp  on sp.STAFF_ID = s.STAFF_ID \n" +
            "left join POSITION p on sp.POSITION_ID = p.POSITION_ID \n" +
            "left join DEPT d on p.dept_id = d.DEPT_ID\n" +
            "left join personal per on per.staff_id = s.staff_id where sp.STAFFPOSITION_ID is not null and per.personal_name like '%${name}%' and sp.DELETED=0 ")
    public IPage<StaffVo> selectAllStaff(Page page,@Param("name") String name);

    @Select("select p.position_id from staff_position sp \n" +
            "left join staff s on sp.STAFF_ID = s.STAFF_ID \n" +
            "left join POSITION p on sp.position_id = p.position_id\n" +
            "where s.STAFF_ID = #{id} and sp.deleted=0")
    public int[] selectPositionByStaffId(int id);

    //查询个人岗位职责
    @Select(
            "select * from DEPT d left join POSITION p on d.DEPT_ID=p.DEPT_ID left join STAFF_POSITION s_p on s_p.POSITION_ID=p.POSITION_ID LEFT JOIN STAFF s on s_p.staff_id=s.staff_id where s.staff_Id=#{id}"
    )
    public List<StaffVo> selectPosition(@Param("id") int staffId);
}
