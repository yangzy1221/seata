package com.example.seatastorage.service;

/**
 * @author yzy
 * @date 2022年09月29日 10:39
 */
public interface StorageService {
    /**
     * 扣除存储数量
     */
    void deduct(String commodityCode, int count);
}
