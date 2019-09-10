package com.tsshare;

import com.tsshare.base.ReponseBase;
import com.tsshare.base.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenzhenfei
 * @title: Web2Controller
 * @projectName studysecond
 * @description: TODO
 * @date 2019/8/2822:46
 */
@SpringBootApplication
@RestController
public class Web2Controller {

    @Autowired
    private ResponseService responseService;

    /**
     * 获取所有的交易
     * @return
     */
    @GetMapping(value = "/")
    public ReponseBase index(){
       return new ReponseBase(200,"成功","this is web2");
    }

    public static void main(String[] args) {
        SpringApplication.run(Web2Controller.class,args);
    }

}
