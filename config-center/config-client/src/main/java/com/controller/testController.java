package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author{作者}
 * @Date{更新日期}2019/5/21-11:05
 */
@RestController
public class testController {

    @Value("${port}")
    private String port;

    @GetMapping("/getServerPort")
    public String getServerPort(){
        return port;
    }

}
