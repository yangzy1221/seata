package com.example.seatabusiness.feign;

/**
 * @author yzy
 * @date 2022年09月29日 11:28
 */

import com.example.seatabusiness.controller.vo.StorageVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(value = "seata-storage",url = "localhost:8020/storage")
public interface StorageFeign {

    @PostMapping(value = "/",consumes = MediaType.APPLICATION_JSON_VALUE)
    void deduct(@RequestBody StorageVo storageVo);
}
