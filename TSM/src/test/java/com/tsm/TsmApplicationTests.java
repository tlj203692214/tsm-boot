package com.tsm;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.mapper.ExpenditureMapper;
import com.tsm.mapper.voMapper.ExpenditureVoMapper;
import com.tsm.mapper.voMapper.IncomeVoMapper;
import com.tsm.vo.IncomeVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class TsmApplicationTests {
    @Autowired
    private IncomeVoMapper incomeVoMapper;

    @Test
    void contextLoads() {
        Page<IncomeVo> page = new Page<>(1,3);
        IPage<IncomeVo> incomeVoIPage = incomeVoMapper.selectIncomeVo(page, null);
        incomeVoIPage.getRecords().forEach(System.out::println);

    }

}
