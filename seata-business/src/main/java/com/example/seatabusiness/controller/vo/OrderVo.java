package com.example.seatabusiness.controller.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yzy
 * @date 2022年09月29日 14:09
 */
@Data
@NoArgsConstructor
public class OrderVo {
    private String userId;
    private String commodityCode;
    private Integer orderCount;

    public OrderVo(String userId, String commodityCode, Integer orderCount) {
        this.userId = userId;
        this.commodityCode = commodityCode;
        this.orderCount = orderCount;
    }
}
