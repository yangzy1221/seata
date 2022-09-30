package com.example.seataorder.service.impl;

import com.example.seataorder.dao.entity.Order;
import com.example.seataorder.dao.mapper.OrderMapper;
import com.example.seataorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yzy
 * @date 2022年09月29日 10:43
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public int create(String userId, String commodityCode, int orderCount) {

        //模拟计算总价
        int orderMoney = 10 * orderCount;
        Order order = new Order();
        order.setUserId(userId);
        order.setCommodityCode(commodityCode);
        order.setCount(orderCount);
        order.setMoney(orderMoney);
        return orderMapper.insert(order);
    }
}
