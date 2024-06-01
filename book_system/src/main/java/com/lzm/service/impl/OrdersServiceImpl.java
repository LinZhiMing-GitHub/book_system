package com.lzm.service.impl;

import com.lzm.domain.Orders;
import com.lzm.dao.OrdersDao;
import com.lzm.service.IOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 林志明
 * @since 2024-05-31
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersDao, Orders> implements IOrdersService {

}
