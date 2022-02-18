package com.tsm;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.entity.Dept;
import com.tsm.entity.Notice;
import com.tsm.entity.Paymoney;
import com.tsm.entity.Refund;
import com.tsm.mapper.DeptMapper;
import com.tsm.mapper.NoticeMapper;
import com.tsm.mapper.PaymoneyMapper;
import com.tsm.mapper.RefundMapper;
import com.tsm.mapper.voMapper.PaymoneyVoMapper;
import com.tsm.mapper.voMapper.PersonalVoMapper;
import com.tsm.vo.RefundVo;
import com.tsm.vo.payMoneyVo;
import com.tsm.vo.personalVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TsmApplicationTests {
    @Autowired
    private PaymoneyVoMapper paymoneyVoMapper;
    @Autowired
    private PaymoneyMapper paymoneyMapper;
    @Autowired
    private RefundMapper refundMapper;
    @Autowired
    private PersonalVoMapper personalVoMapper;
    @Autowired
    private NoticeMapper noticeMapper;
    @Autowired
    private DeptMapper deptMapper;
    @Test
    void contextLoads() {
//       List<personalVo> list=personalVoMapper.selectPersonalVo(2);
//        System.out.println(list+"盘骨干是再");
        int a = 3;
        for (int i = 0; i <= 100;i++){
            Dept dept = deptMapper.selectById(a);
            if(dept.getDeptId()==1){
                System.out.println("结束循环成功");
                break;
            }

           a=dept.getDeptDid();
    if(a==0){
        System.out.println("结束循环失败");
        break;
    }
        }
    }
}
