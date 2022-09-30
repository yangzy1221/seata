package com.example.seatastorage.controller;

import com.example.seatastorage.controller.vo.StorageVo;
import com.example.seatastorage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yzy
 * @date 2022年09月29日 13:40
 */
@RestController
@RequestMapping("/storage")
public class StorageController {

    @Autowired
    private StorageService service;

    @PostMapping("/")
    public void deduct(@RequestBody StorageVo vo){
        service.deduct(vo.getCommodityCode(),vo.getCount());
    }

}
