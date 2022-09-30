package com.example.seataorder.controller.vo;

import lombok.Data;

/**
 * @author yzy
 * @date 2022年09月29日 14:09
 */
@Data
public class OrderVo {
    private String userId;
    private String commodityCode;
    private Integer orderCount;
}
