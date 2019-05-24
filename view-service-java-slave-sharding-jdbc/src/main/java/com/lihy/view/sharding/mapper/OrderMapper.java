package com.lihy.view.sharding.mapper;

import com.lihy.view.common.entity.Order;
import com.lihy.view.sharding.commom.OrderRequest;

import java.util.List;

/**
 * @author lihy
 * @date 2018/10/25
 */
public interface OrderMapper {
    int insertOrder(OrderRequest order);
    List<Order> selectOrderByUserId(Integer userId);

    //List<Order> selectByOrderIdBetween(@Param("startOrderId") Long startOrderId, @Param("endOrderId") Long endOrderId);
}
