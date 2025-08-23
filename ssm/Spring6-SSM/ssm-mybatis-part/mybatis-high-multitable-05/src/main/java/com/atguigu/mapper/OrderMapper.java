package com.atguigu.mapper;

import com.atguigu.pojo.Order;

/**
 * projectName: com.atguigu.mapper
 *
 * 
 * description: 订单方法
 */
public interface OrderMapper {

    // 根据id查询订单信息和订单对应的客户
    Order queryOrderById(Integer id);
}
