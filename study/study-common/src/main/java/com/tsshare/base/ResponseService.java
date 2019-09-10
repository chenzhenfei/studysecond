package com.tsshare.base;

import org.springframework.stereotype.Component;

/**
 * @author chenzhenfei
 * @title: ResponseService
 * @projectName studysecond
 * @description: TODO
 * @date 2019/7/3123:29
 */
@Component
public class ResponseService {

    public ReponseBase setSuccess(Object data){
        return new ReponseBase(ResponseEnum.rtn_200,data);
    }

    public ReponseBase setResult(int code,String message,Object data){
        return new ReponseBase(code,message,data);
    }

    public ReponseBase setError(){
        return new ReponseBase(ResponseEnum.rtn_500);
    }

}
