package com.lzm.service.impl;

import com.lzm.domain.Books;
import com.lzm.dao.BooksDao;
import com.lzm.service.IBooksService;
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
public class BooksServiceImpl extends ServiceImpl<BooksDao, Books> implements IBooksService {

}
