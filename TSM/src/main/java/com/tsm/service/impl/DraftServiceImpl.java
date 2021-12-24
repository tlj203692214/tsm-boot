package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Draft;
import com.tsm.entity.Send;
import com.tsm.mapper.DraftMapper;
import com.tsm.service.IDraftService;
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
public class DraftServiceImpl extends ServiceImpl<DraftMapper, Draft> implements IDraftService {
    @Autowired
    private  DraftMapper draftMapper;
    @Override
    public int addDraft(Draft draft) {
        int a=draftMapper.insert(draft);
        return a;
    }

    @Override
    public IPage<Draft> findAllDraft(int page, int size, String name, String js, String input) {
        QueryWrapper<Draft> wrapper=new QueryWrapper<>();
        wrapper.eq("DELETED",0)
                .eq("STAFF_NAME1",name);

        if(js.equals("标题")){
            wrapper.inSql("DRAFT_TITLE", "select DRAFT_TITLE from DRAFT where DRAFT_TITLE like '%" +input+ "%'");
        }else {
            wrapper.inSql("STAFF_NAME2", "select STAFF_NAME2 from DRAFT where STAFF_NAME2 like '%" +input+ "%'");
        }
        Page<Draft> page1=new Page<>(page,size);
        IPage<Draft> draftIPage = draftMapper.selectPage(page1,wrapper);
        return draftIPage;
    }
    @Override
    public int delectDraft(Draft draft) {
        int id= draft.getDraftId();
        Draft draft1=draftMapper.selectById(id);
        draft1.setDeleted(1);
        Integer integer=draftMapper.updateById(draft1);
        return integer;
    }
}
