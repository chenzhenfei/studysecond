package com.tsshare.deal.service;

import com.tsshare.deal.entity.Deal;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author chenzhenfei
 * @title: DealService
 * @projectName studysecond
 * @description: 交易服务
 * @date 2019/7/3122:38
 */
public interface DealService {
    /**
     * 查询所有交易信息
     *
     * @return
     */
    List<Deal> findList();

    /**
     * 根据id 查询交易信息
     *
     * @param id
     * @return
     */
    Deal findById(int id);
}
