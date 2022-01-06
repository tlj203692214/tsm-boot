package com.tsm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Opinion;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-22
 */
public interface IOpinionService extends IService<Opinion> {
    //分页模糊查询发出的意见
    public IPage<Opinion> opinion(int page,int size,String zt,String staffName);
    //增加意见
    public  int addOpinion(Opinion opinion);
    //修改意见内容
    public int updateOpinion(Opinion opinion);
    //删除意见
    public int delectOpinion(int opinionId);
    //分页模糊查询收到的意见
    public IPage<Opinion> selectOpinion(int page,int size,String zt,int staffId);
    //回复意见
    public  int replyOpinion(Opinion opinion);

}
