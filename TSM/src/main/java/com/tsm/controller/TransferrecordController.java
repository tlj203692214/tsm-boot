package com.tsm.controller;


import com.tsm.entity.Transferrecord;
import com.tsm.service.ITransferrecordService;
import com.tsm.service.impl.TransferrecordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@RestController
@RequestMapping("/transferrecord")
public class TransferrecordController {
    @Autowired
    private ITransferrecordService service;

    @PostMapping("addtransferrecord")
    public int addtransferrecord(@RequestBody Transferrecord transferrecord){
        int a=service.addItrans(transferrecord);
        return a;
    }


}
