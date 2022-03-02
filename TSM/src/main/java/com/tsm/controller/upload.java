package com.tsm.controller;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.IdUtil;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Encoder;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/photo")
@Slf4j
public class upload {

    @Value("${server.port}")
    private String port;

    private String ip="localhost";



    /**
     * 上传接口
     * @param file
     * @return
     * @throws IOException
     */
    @PostMapping("/upload")
    public String selectUpload(MultipartFile file) throws IOException {

        String originalFilename = file.getOriginalFilename();  // 获取源文件的名称
        System.out.println(originalFilename+"bbbbbb");
        // 定义文件的唯一标识（前缀）
        String flag = IdUtil.fastSimpleUUID();
        String rootFilePath = System.getProperty("user.dir") + "/files/" + flag + "_" + originalFilename;  // 获取上传的路径
        System.out.println(rootFilePath+"bbbbbb");

        FileUtil.writeBytes(file.getBytes(), rootFilePath);  // 把文件写入到上传的路径
        System.out.println(rootFilePath+"bbbbbb");
        System.out.println("http://" + ip + ":" + port +"/files/" + flag+"sssssss");
        return "http://" + ip + ":" + port +"/files/" + flag;  // 返回结果 url

    }



}
