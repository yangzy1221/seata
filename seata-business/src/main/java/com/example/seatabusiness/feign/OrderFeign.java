package com.example.seatabusiness.feign;

import com.example.seatabusiness.controller.vo.OrderVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author yzy
 * @date 2022年09月29日 11:28
 */
@Component
@FeignClient(value = "seata-order",url = "localhost:8010/order")
public interface OrderFeign {

    @PostMapping(value = "/")
    int create(@RequestBody OrderVo orderVo);
}
