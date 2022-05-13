package com.example.demo.controller;

import com.example.demo.domain.Test;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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
    @Value("${test.hello:TEST}")
    private String testHello;

    @Resource
    private TestService testService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World! POST,"+name;
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }

}
