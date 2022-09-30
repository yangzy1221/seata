package com.example.seataorder.service;

import com.example.seataorder.dao.entity.Order;

/**
 * @author yzy
 * @date 2022年09月29日 10:42
 */
public interface OrderService {
    /**
     * 创建订单
     */
    int create(String userId, String commodityCode, int orderCount);
}
