package com.tsm.controller;


import com.tsm.entity.Notepad;
import com.tsm.service.INotepadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
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
@RequestMapping("/notepad")
@CrossOrigin(maxAge = 60)

public class NotepadController {
@Autowired
    private INotepadService iNotepadService;
    @PostMapping("/addNotepad")       //新增记事本
  public int addNotepad(@RequestBody Notepad notepad){
      int a=iNotepadService.addNotepad(notepad);
      return  a;
  }
    @GetMapping ("/selectNotepad/{staffId}")   //查询记事本
    public List<Notepad> selectNotepad(@PathVariable("staffId") int staffId){
        List<Notepad> list=iNotepadService.selectNotepad(staffId);
        return  list;
    }
    @PostMapping("/updateNotepad")       //修改记事本
    public int updateNotepad(@RequestBody Notepad notepad){
        System.out.println(notepad+"时间");
        int a=iNotepadService.updateNotepad(notepad);
        System.out.println(a);
        return  a;
    }
    @PostMapping("/delectNotepad")       //修改记事本
    public int delectNotepad(@RequestBody Notepad notepad){

        int a=iNotepadService.delectNotepad(notepad);

        return  a;
    }
}
