package com.lzm.service;

import com.lzm.domain.Books;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lzm.dto.Result;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 林志明
 * @since 2024-05-31
 */
public interface IBooksService extends IService<Books> {

    /**
     * 获取所有书籍数据
     * @return
     */
    String getAllBooks();

}
