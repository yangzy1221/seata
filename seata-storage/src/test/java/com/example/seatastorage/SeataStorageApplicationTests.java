package com.example.seatastorage;

import com.example.seatastorage.controller.vo.StorageVo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeataStorageApplicationTests {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void contextLoads() {
        System.out.println(objectMapper.canSerialize(StorageVo.class,null));
    }

}
