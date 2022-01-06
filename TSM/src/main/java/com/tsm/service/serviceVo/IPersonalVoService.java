package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.vo.personalVo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IPersonalVoService extends IService<personalVo> {
    public personalVo selectPicture(int id);
}
