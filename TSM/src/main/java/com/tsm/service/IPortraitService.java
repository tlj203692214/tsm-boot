package com.tsm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Opinion;
import com.tsm.entity.Portrait;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IPortraitService extends IService<Portrait> {
        public int updatePortrait(Portrait portrait);
        public Portrait selectPortrait(int id);

}
