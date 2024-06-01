package com.lzm.dao;

import com.lzm.domain.Orders;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 林志明
 * @since 2024-05-31
 */
@Mapper
public interface OrdersDao extends BaseMapper<Orders> {

}
