package com.example.seataorder.controller;

import com.example.seataorder.controller.vo.OrderVo;
import com.example.seataorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yzy
 * @date 2022年09月29日 13:39
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/")
    public int create(@RequestBody OrderVo vo){
        return orderService.create(vo.getUserId(),vo.getCommodityCode(),vo.getOrderCount());
    }
}
