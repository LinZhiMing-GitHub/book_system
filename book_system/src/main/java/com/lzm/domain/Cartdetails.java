package com.lzm.domain;

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
@TableName("tb_cartdetails")
public class Cartdetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cart_detail_id", type = IdType.AUTO)
    private Integer cart_detail_id;

    private Integer cart_id;

    private Integer book_id;

    private Integer quantity;

    @TableLogic
    private Integer deleted;

    @Version
    private Integer version;


}
