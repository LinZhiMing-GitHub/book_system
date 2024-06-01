package com.lzm.service.impl;

import com.lzm.domain.Payments;
import com.lzm.dao.PaymentsDao;
import com.lzm.service.IPaymentsService;
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
public class PaymentsServiceImpl extends ServiceImpl<PaymentsDao, Payments> implements IPaymentsService {

}
