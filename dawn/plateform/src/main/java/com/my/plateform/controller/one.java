package com.my.plateform.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @auther huyupeng
 * @Date: 2020/7/1 16:39
 * @Description:
 */
@RestController
@RequestMapping(value = "/asrData")
public class one {
    @RequestMapping(value = "/getAsrVoiceFile", method = RequestMethod.GET)
    public void getAsrVoiceFile(String asrAddress, HttpServletResponse response) {
        File file = new File(asrAddress);
        FileInputStream input = null;
        OutputStream out = null;
        try {
            if (file.exists()) {
                int length = (int) file.length();
                input = new FileInputStream(file);
                byte[] buff = new byte[length];
                input.read(buff);
                response.addHeader("Content-type", "audio/mpeg;charset=UTF-8");
                out = response.getOutputStream();
                out.write(buff);


            } else {
                throw new Exception("查询地址不存在");
            }
            System.out.println("成功");
        } catch (Exception e) {
            System.out.println(e);
        }finally {
            try {
                if (null != input){
                    input.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (null != out){
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
