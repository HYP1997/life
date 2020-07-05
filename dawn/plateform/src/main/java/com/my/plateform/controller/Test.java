package com.my.plateform.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther huyupeng
 * @Date: 2020/6/29 15:24
 * @Description:
 */
@RestController
@RequestMapping("/plateform")
public class Test {
    @RequestMapping("/one")
    public String test(){
        return "Ok";
    }
}
