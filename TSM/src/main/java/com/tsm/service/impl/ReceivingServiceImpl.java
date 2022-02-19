package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Receiving;
import com.tsm.mapper.ReceivingMapper;
import com.tsm.service.IReceivingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ..
 * @since 2021-12-09
 */
@Service
public class ReceivingServiceImpl extends ServiceImpl<ReceivingMapper, Receiving> implements IReceivingService {
    @Autowired
    private ReceivingMapper receivingMapper;


    @Override
    public int addreceiving(Receiving receiving) {
        System.out.println(receiving.toString() + "数据");
        return receivingMapper.insert(receiving);
    }

    @Override
    public IPage<Receiving> findAllreceiving(int page, int size, String name, String zt, String js, String input) {
        QueryWrapper<Receiving> wrapper = new QueryWrapper<>();
        wrapper.inSql("STAFF_NAME2", "select STAFF_NAME2 from RECEIVING where STAFF_NAME2 like '%" + name + "%'")
                .notLike("RECEIVING_DELETED", name)
                .orderByDesc("RECEIVINGS_ID");
        if (zt.equals("a")) {

        } else if (zt.equals("b")) {
            wrapper.like("RECEIVINGS_STATE", name);
        } else {
            wrapper.notLike("RECEIVINGS_STATE", name);
        }
        if (js.equals("标题")) {
            wrapper.inSql("RECEIVINGS_TITLE", "select RECEIVINGS_TITLE from RECEIVING where RECEIVINGS_TITLE like '%" + input + "%'");
        } else {
            wrapper.inSql("STAFF_NAME1", "select STAFF_NAME1 from RECEIVING where STAFF_NAME1 like '%" + input + "%'");
        }
        Page<Receiving> page1 = new Page<>(page, size);
        IPage<Receiving> sendIPage = receivingMapper.selectPage(page1, wrapper);

        return sendIPage;
    }

    @Override
    public int delectsends(Receiving receiving) {
        int id = receiving.getReceivingsId();
        String staffName = receiving.getStaffName2();
        System.out.println(id);
        System.out.println(staffName);
        Receiving receiving1 = receivingMapper.selectById(id);
        String a = receiving1.getReceivingDeleted();
        receiving1.setReceivingDeleted(a + "," + staffName);
        Integer result = receivingMapper.updateById(receiving1);
        return result;
    }

    @Override
    public int xgreceiving(Receiving receiving) {
        QueryWrapper<Receiving> wrapper = new QueryWrapper<>();
        int id = receiving.getReceivingsId();
        String staffName = receiving.getStaffName2();
        wrapper.eq("RECEIVINGS_ID", id)
                .notLike("RECEIVINGS_STATE", staffName);
        List<Receiving> list = receivingMapper.selectList(wrapper);
        Receiving receiving1 = receivingMapper.selectById(id);
        String a = receiving1.getReceivingsState();

        System.out.println(id);
        System.out.println(staffName);
        if (list != null && !list.isEmpty() && a.equals("1")) {
            receiving1.setReceivingsState(staffName);
            Integer result = receivingMapper.updateById(receiving1);
            return result;
        } else if (list != null && !list.isEmpty() && !a.equals("1")) {

            receiving1.setReceivingsState(a + "," + staffName);
            Integer result = receivingMapper.updateById(receiving1);
            return result;
        } else {
            receiving1.setReceivingsState(a);
            Integer result = receivingMapper.updateById(receiving1);
            return result;
        }
    }
}
