package com.example.seatabusiness.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.seatabusiness.controller.vo.OrderVo;
import com.example.seatabusiness.controller.vo.StorageVo;
import com.example.seatabusiness.feign.OrderFeign;
import com.example.seatabusiness.feign.StorageFeign;
import com.example.seatabusiness.service.BusinessService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yzy
 * @date 2022年09月29日 11:15
 */
@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private OrderFeign orderFeign;

    @Autowired
    private StorageFeign storageFeign;

    @Override
    @GlobalTransactional
    public void purchase(String userId, String commodityCode, int orderCount) {
        storageFeign.deduct(new StorageVo(commodityCode, orderCount));
        orderFeign.create(new OrderVo(userId, commodityCode, orderCount));
    }
}
