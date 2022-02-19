package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.vo.positionNavVo;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface PositionNavVoService extends IService<positionNavVo> {
    //        根据角色id查询权限信息
    public int[] selectPosById(int id);
}
