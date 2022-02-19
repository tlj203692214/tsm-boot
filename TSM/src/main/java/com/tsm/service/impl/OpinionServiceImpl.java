package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.entity.Opinion;
import com.tsm.mapper.OpinionMapper;
import com.tsm.service.IOpinionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-22
 */
@Service
public class OpinionServiceImpl extends ServiceImpl<OpinionMapper, Opinion> implements IOpinionService {
    @Autowired
    private OpinionMapper opinionMapper;

    @Override
    public IPage<Opinion> opinion(int page, int size, String zt, String staffName) {
        QueryWrapper<Opinion> wrapper = new QueryWrapper<>();
        wrapper.eq("publisher", staffName)
                .eq("DELETED", 0)
                .orderByDesc("OPINION_ID");
        if (zt.equals("全部的意见")) {

        } else if (zt.equals("待回复的意见")) {
            wrapper.isNull("RESPONDENT");
        } else {
            wrapper.isNotNull("RESPONDENT");
        }
        Page<Opinion> page1 = new Page<>(page, size);
        IPage<Opinion> iPage = opinionMapper.selectPage(page1, wrapper);
        return iPage;
    }

    @Override
    public int addOpinion(Opinion opinion) {
        int a = opinionMapper.insert(opinion);
        return a;
    }

    @Override
    public int updateOpinion(Opinion opinion) {
        int a = opinionMapper.updateById(opinion);
        return a;
    }

    @Override
    public int delectOpinion(int opinionId) {
        Opinion opinion = opinionMapper.selectById(opinionId);
        opinion.setDeleted(1);
        int a = opinionMapper.updateById(opinion);
        return a;
    }

    @Override
    public IPage<Opinion> selectOpinion(int page, int size, String zt, int staffId) {
        QueryWrapper<Opinion> wrapper = new QueryWrapper<>();
        wrapper.eq("STAFF_ID", staffId)
                .eq("DELETED", 0)
                .orderByDesc("OPINION_ID");
        if (zt.equals("待回复的意见")) {
            wrapper.isNull("RESPONDENT");
        } else {
            wrapper.isNotNull("RESPONDENT");
        }
        Page<Opinion> page1 = new Page<>(page, size);
        IPage<Opinion> iPage = opinionMapper.selectPage(page1, wrapper);
        return iPage;
    }

    @Override
    public int replyOpinion(Opinion opinion) {
        opinion.setReplyTime(new Date());
        int a = opinionMapper.updateById(opinion);
        return a;
    }
}
