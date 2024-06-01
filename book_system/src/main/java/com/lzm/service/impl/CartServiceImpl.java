package com.lzm.service.impl;

import com.lzm.domain.Cart;
import com.lzm.dao.CartDao;
import com.lzm.service.ICartService;
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
public class CartServiceImpl extends ServiceImpl<CartDao, Cart> implements ICartService {

}
