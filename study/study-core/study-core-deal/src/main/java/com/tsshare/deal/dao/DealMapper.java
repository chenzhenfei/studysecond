package com.tsshare.deal.dao;

import com.tsshare.deal.entity.Deal;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author chenzhenfei
 * @title: DealMapper
 * @projectName studysecond
 * @description: TODO
 * @date 2019/7/3122:44
 */
@Mapper
public interface DealMapper {
    List<Deal> findList();
    Deal findById(int id);
}
