package com.example.seataorder.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yzy
 * @date 2022年09月29日 10:43
 */
@Data
@NoArgsConstructor
@TableName("order_tbl")
public class Order {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("user_id")
    private String userId;

    @TableField("commodity_code")
    private String commodityCode;


    @TableField("count")
    private Integer count;


    @TableField("money")
    private Integer money;

}
