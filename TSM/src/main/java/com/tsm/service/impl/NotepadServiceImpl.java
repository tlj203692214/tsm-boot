package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Notepad;
import com.tsm.mapper.NotepadMapper;
import com.tsm.service.INotepadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
@Autowired
private  NotepadMapper notepadMapper;
    @Override
    public int addNotepad(Notepad notepad) {
        int a=notepadMapper.insert(notepad);
        return a;
    }

    @Override
    public List<Notepad> selectNotepad(int staffId) {
        QueryWrapper<Notepad> wrapper=new QueryWrapper<>();
        wrapper.eq("STAFF_ID",staffId);
        wrapper.eq("DELETED",0);
        List<Notepad> list=notepadMapper.selectList(wrapper);
        return list;
    }

    @Override
    public int updateNotepad(Notepad notepad) {
        int a=notepadMapper.updateById(notepad);
        return a;
    }

    @Override
    public int delectNotepad(Notepad notepad) {
        int a=notepadMapper.updateById(notepad);
        return a;
    }
}
