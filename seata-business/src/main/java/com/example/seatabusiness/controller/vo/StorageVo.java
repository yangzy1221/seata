package com.example.seatabusiness.controller.vo;

import lombok.*;

import java.io.Serializable;

/**
 * @author yzy
 * @date 2022年09月29日 13:41
 */
@Data
@NoArgsConstructor
public class StorageVo implements Serializable {
    private String commodityCode;
    private Integer count;

    public StorageVo(String commodityCode, Integer count) {
        this.commodityCode = commodityCode;
        this.count = count;
    }
}
