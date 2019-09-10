package com.tsshare.base;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author chenzhenfei
 * @title: ReponseBase
 * @projectName studysecond
 * @description: TODO
 * @date 2019/7/3123:27
 */
@Slf4j
@Getter
@Setter
public class ReponseBase {
    private int code;
    private String message;
    private Object data;
    private ResponseEnum responseEnum;

    public ReponseBase(ResponseEnum responseEnum,Object data) {
        this.responseEnum = responseEnum;
        this.data=data;
    }

    public ReponseBase(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ReponseBase(ResponseEnum responseEnum) {
        this.responseEnum = responseEnum;
        this.code =responseEnum.getCode();
        this.message =responseEnum.getMessage();
    }
}
