package com.example.seatabusiness.service;

/**
 * @author yzy
 * @date 2022年09月29日 11:14
 */
public interface BusinessService {
    /**
     * 采购
     */
    void purchase(String userId, String commodityCode, int orderCount);
}
