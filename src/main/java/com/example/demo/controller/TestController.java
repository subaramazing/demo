package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Admin
 * @createTime 2022/5/12 12:49
 * @discription
 **/
@RestController
public class TestController {
//    http://127.0.0.1:8880/hello
   //GET（查询）,POST（新增），put（修改），DELETE（删除）
   //RequestMapping支持以上所有的Mapping
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
