package com.example.seataorder.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.seataorder.dao.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author yzy
 * @date 2022年09月29日 10:44
 */
@Mapper
@Repository
public interface OrderMapper extends BaseMapper<Order> {
}
