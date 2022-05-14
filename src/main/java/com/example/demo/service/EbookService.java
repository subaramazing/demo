package com.example.demo.service;

import com.example.demo.domain.EBook;
import com.example.demo.mapper.EBookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Admin
 * @createTime 2022/5/13 22:36
 * @discription
 **/

@Service
public class EbookService {

    @Resource
    private EBookMapper eBookMapper;

    public List<EBook> list(){
        return eBookMapper.selectByExample(null);

    }
}

