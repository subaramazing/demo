package com.example.demo.service;

import com.example.demo.domain.Test;
import com.example.demo.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Admin
 * @createTime 2022/5/13 22:36
 * @discription
 **/

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.list();

    }
}

