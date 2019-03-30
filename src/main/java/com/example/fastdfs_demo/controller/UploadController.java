package com.example.fastdfs_demo.controller;


import com.example.fastdfs_demo.common.FastDFSClientWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yanlianglong on 2019/3/30.
 */
@RestController
public class UploadController {
    @Autowired
    private FastDFSClientWrapper dfsClient;

//    @ResponseBody
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public Map<String, String> upload(@RequestParam(value="file",required=false) MultipartFile file, HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 省略业务逻辑代码。。。
        System.out.println("file:"+file);
        String imgUrl = dfsClient.uploadFile(file);
        System.out.println("imgUrl:"+imgUrl);
        Map<String, String> map = new HashMap<>();
        map.put("url", imgUrl);
        map.put("status", "success");
        // 。。。。
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "/topage", method = RequestMethod.GET)
    public String toIndex() {
        return "01";
    }
}
