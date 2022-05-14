package com.example.demo.controller;

import com.example.demo.domain.EBook;
import com.example.demo.resp.CommonResp;
import com.example.demo.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Admin
 * @createTime 2022/5/12 12:49
 * @discription
 **/
@RestController
@RequestMapping("/ebook")
public class EBookController {


    @Resource
    private EbookService eBookService;

    @GetMapping("/list")
    public CommonResp list(){
        CommonResp<List<EBook>> resp = new CommonResp<>();
        List<EBook> list =  eBookService.list();
        resp.setContent(list);
        return resp;
    }

}
