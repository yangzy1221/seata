package com.example.seatabusiness.controller;

import com.example.seatabusiness.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yzy
 * @date 2022年09月29日 14:13
 */
@RestController
@RequestMapping("/business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @PostMapping("/test1")
    public void test1(){
        businessService.purchase("uid1","01",10);
    }

    @PostMapping("/test2")
    public void test2(){
        businessService.purchase("uid1","01",100);
    }
}
