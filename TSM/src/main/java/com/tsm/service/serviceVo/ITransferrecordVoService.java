package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.vo.FollowVo;
import com.tsm.vo.TransferrecordVo;

import java.util.List;

public interface ITransferrecordVoService extends IService<TransferrecordVo> {
    public List<TransferrecordVo> selectlist(int id);
}
