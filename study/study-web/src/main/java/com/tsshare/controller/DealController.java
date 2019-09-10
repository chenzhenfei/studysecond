package com.tsshare.controller;

import com.tsshare.base.ReponseBase;
import com.tsshare.base.ResponseService;
import com.tsshare.deal.service.DealService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author chenzhenfei
 * @title: DealController
 * @projectName studysecond
 * @description: 路由控制层
 * @date 2019/7/3123:12
 */
@RestController
@RequestMapping
public class DealController {
    @Autowired
    private DealService dealService;
    @Autowired
    private ResponseService responseService;

    /**
     * 获取所有的交易
     * @return
     */
    @GetMapping(value = "/")
    public ReponseBase index(){
        try {
            return responseService.setSuccess("this is web1");
        } catch (Exception e) {
            e.printStackTrace();
            return responseService.setError();
        }
    }

    /**
     * 获取所有的交易
     * @return
     */
    @GetMapping(value = "findAll")
    public ReponseBase findList(){
        try {
            return responseService.setSuccess(dealService.findList());
        } catch (Exception e) {
            e.printStackTrace();
            return responseService.setError();
        }
    }

    /**
     * 获取所有的交易
     * @return
     */
    @GetMapping(value = "findById")
    public ReponseBase findById(@Param(value = "id") int id){
        try {
            return responseService.setSuccess(dealService.findById(id));
        } catch (Exception e) {
            e.printStackTrace();
            return responseService.setError();
        }
    }

}
