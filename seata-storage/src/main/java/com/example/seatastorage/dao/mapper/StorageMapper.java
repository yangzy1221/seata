package com.example.seatastorage.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.seatastorage.dao.entity.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author yzy
 * @date 2022年09月29日 11:01
 */
@Mapper
@Repository
public interface StorageMapper extends BaseMapper<Storage> {
}
