package com.tsm.handler;


import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
//插入时的填充策略
    @Override
    public void insertFill(MetaObject metaObject){
  log.info("start insert fill........");
  //setFieldValByName(String fieldName,Object fieldVal,MetaObject metaObject)
this.setFieldValByName("sendDate",new Date(),metaObject);
        this.setFieldValByName("receivingsDate",new Date(),metaObject);
        this.setFieldValByName("draftDate",new Date(),metaObject);
        this.setFieldValByName("noticeDate",new Date(),metaObject);
        this.setFieldValByName("publicationTime",new Date(),metaObject);
        this.setFieldValByName("positionCreated",new Date(),metaObject);
        this.setFieldValByName("positionUpdated",new Date(),metaObject);
    }
//更新时的填充策略
@Override
    public  void updateFill(MetaObject metaObject){
    log.info("start update fill........");
    this.setFieldValByName("sandrDate",new Date(),metaObject);
    this.setFieldValByName("noticeDate",new Date(),metaObject);
    this.setFieldValByName("positionCreated",new Date(),metaObject);
    this.setFieldValByName("positionUpdated",new Date(),metaObject);

}
}

