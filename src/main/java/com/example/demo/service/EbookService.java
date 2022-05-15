package com.example.demo.service;

import com.example.demo.domain.EBook;
import com.example.demo.domain.EBookExample;
import com.example.demo.mapper.EBookMapper;
import com.example.demo.req.EBookReq;
import com.example.demo.resp.EBookResp;
import com.example.demo.util.CopyUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

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

    public List<EBookResp> list(EBookReq req){
        EBookExample eBookExample = new EBookExample();
        EBookExample.Criteria criteria = eBookExample.createCriteria();
        if (!ObjectUtils.isEmpty(req.getName())){
            criteria.andNameLike("%" + req.getName() + "%");
        }
        List<EBook> eBooklist = eBookMapper.selectByExample(eBookExample);

//        List<EBookResp> respList = new ArrayList<>();
//        for (EBook eBook : eBooklist) {
//            EBookResp eBookResp = new EBookResp();
//            BeanUtils.copyProperties(eBook,eBookResp);
        //对象复制
//            EBookResp eBookResp = CopyUtil.copy(eBook, EBookResp.class);
//          测试eBookResp.setId(123L);
//            respList.add(eBookResp);
//        }
        //列表复制
        List<EBookResp> list = CopyUtil.copyList(eBooklist, EBookResp.class);

        return list;
    }
}

