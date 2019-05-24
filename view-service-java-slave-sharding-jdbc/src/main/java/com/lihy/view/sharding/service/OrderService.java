package com.lihy.view.sharding.service;

import com.lihy.view.common.entity.Order;
import com.lihy.view.common.util.ResponseResult;
import com.lihy.view.sharding.commom.OrderRequest;

import java.util.List;

/**
 * @author lihy
 * @date 2018/10/25
 */
public interface OrderService {
    ResponseResult<Void> insertOrder(OrderRequest order);
    ResponseResult<List<Order>> selectOrderByUserId(Integer userId);
}
