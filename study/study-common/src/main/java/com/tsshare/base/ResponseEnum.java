package com.tsshare.base;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author chenzhenfei
 * @title: ResponseEnum
 * @projectName studysecond
 * @description: TODO
 * @date 2019/7/3123:30
 */
@Slf4j
@Getter
public enum ResponseEnum {
    rtn_200(200,"成功"),
    rtn_500(500,"失败"),
    rtn_404(500,"请求不存在"),
    rtn_400(400,"异常");

    private int code;
    private String message;

    ResponseEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }



}
