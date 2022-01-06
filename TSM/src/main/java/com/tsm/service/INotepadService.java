package com.tsm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Notepad;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface INotepadService extends IService<Notepad> {
    //新增记事本
public int addNotepad(Notepad notepad);
   //查询记事本
public List<Notepad>  selectNotepad(int staffId);
  //修改记事本
public  int updateNotepad(Notepad notepad);
  //删除记事本
public  int delectNotepad(Notepad notepad);
}
