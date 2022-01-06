package com.tsm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Notepad;
import com.tsm.mapper.NotepadMapper;
import com.tsm.service.INotepadService;
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
public class NotepadServiceImpl extends ServiceImpl<NotepadMapper, Notepad> implements INotepadService {

}
