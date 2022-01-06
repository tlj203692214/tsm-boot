package com.tsm.service.impl.implVo;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.mapper.voMapper.PersonalVoMapper;
import com.tsm.service.serviceVo.IPersonalVoService;
import com.tsm.vo.personalVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Service
public class PersonalVoServiceImpl extends ServiceImpl<PersonalVoMapper, personalVo> implements IPersonalVoService {
    @Autowired
    private PersonalVoMapper personalVoMapper;
    @Override
    public personalVo selectPicture(int id) {
        return personalVoMapper.selectPicture(id);
    }
}
