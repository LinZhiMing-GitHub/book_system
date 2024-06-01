package com.lzm.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 林志明
 * @since 2024-05-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_orders")
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_id", type = IdType.AUTO)
    private Integer order_id;

    private Integer user_id;

    private String status;

    private BigDecimal total_price;

    @TableLogic
    private Integer deleted;

    @Version
    private Integer version;


}
