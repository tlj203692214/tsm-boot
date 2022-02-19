package com.tsm.controller.controllerVo;

import com.tsm.entity.Transferrecord;
import com.tsm.service.serviceVo.ITransferrecordVoService;
import com.tsm.vo.TransferrecordVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transferrecordVo")
public class transferrecordVoController {
    @Autowired
    private ITransferrecordVoService service;

    @GetMapping("/selecttransferrecordlist/{id}")
    public List<TransferrecordVo> selecttransferrecord(@PathVariable(name = "id") int id){
        List<TransferrecordVo> list=service.selectlist(id);
        return list;
    }
}
