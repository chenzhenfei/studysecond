package com.tsshare.deal.service.impl;

import com.tsshare.deal.entity.Deal;
import com.tsshare.deal.service.DealService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenzhenfei
 * @title: DealServiceImpl
 * @projectName studysecond
 * @description: TODO
 * @date 2019/7/3122:44
 */
@Component
public class DealServiceImpl implements DealService {
    @Override
    public List<Deal> findList(){
        List<Deal> dealList=new ArrayList<>();
        Deal a =new Deal();
        a.setId(1);
        a.setCode("001");
        a.setRemark("测试001");

        Deal b =new Deal();
        b.setId(1);
        b.setCode("002");
        b.setRemark("测试002");
        dealList.add(a);
        dealList.add(b);
        return  dealList;
    }

    @Override
    public Deal findById(int id) {
        Deal a =new Deal();
        a.setId(1);
        a.setCode("001");
        a.setRemark("测试001");
        return  a;
    }
}
