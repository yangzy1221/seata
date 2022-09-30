package com.example.seatastorage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.seatastorage.dao.entity.Storage;
import com.example.seatastorage.dao.mapper.StorageMapper;
import com.example.seatastorage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yzy
 * @date 2022年09月29日 13:43
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageMapper storageMapper;

    @Override
    public void deduct(String commodityCode, int count) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("commodity_code", commodityCode);
        Storage storage = storageMapper.selectOne(queryWrapper);
        if(count>storage.getCount()){
            throw new RuntimeException("库存不足！！");
        }
        storage.setCount(storage.getCount()-count);
        storageMapper.updateById(storage);
    }
}
