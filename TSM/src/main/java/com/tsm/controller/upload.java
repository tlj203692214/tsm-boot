package com.tsm.controller;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.IdUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/photo")

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
        System.out.println(originalFilename);
        // 定义文件的唯一标识（前缀）
        String flag = IdUtil.fastSimpleUUID();
        String rootFilePath = System.getProperty("user.dir") + "/files/" + flag + "_" + originalFilename;  // 获取上传的路径
        FileUtil.writeBytes(file.getBytes(), rootFilePath);  // 把文件写入到上传的路径
        return "http://" + ip + ":" + port +"/files/" + flag;  // 返回结果 url
    }

}
