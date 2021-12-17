package com.tsm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Draft;
import com.tsm.mapper.DraftMapper;
import com.tsm.service.IDraftService;
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
public class DraftServiceImpl extends ServiceImpl<DraftMapper, Draft> implements IDraftService {

}
