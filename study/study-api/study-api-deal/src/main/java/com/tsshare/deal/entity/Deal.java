package com.tsshare.deal.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author chenzhenfei
 * @title: Deal
 * @projectName studysecond
 * @description: 交易实体类
 * @date 2019/7/3122:34
 */
@Slf4j
@Getter
@Setter
public class Deal {
    private int id;
    private String code;
    private String remark;
}
