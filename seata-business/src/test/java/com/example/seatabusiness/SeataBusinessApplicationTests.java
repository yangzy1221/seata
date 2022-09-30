package com.example.seatabusiness;

import com.example.seatabusiness.controller.vo.StorageVo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeataBusinessApplicationTests {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void contextLoads() {
        boolean b = objectMapper.canSerialize(StorageVo.class, null);
        System.out.println(b);

    }

}
