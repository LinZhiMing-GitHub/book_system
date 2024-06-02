package com.lzm.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.alibaba.fastjson.JSON;
import com.lzm.domain.Books;
import com.lzm.dao.BooksDao;
import com.lzm.dto.BooksDTO;
import com.lzm.dto.Result;
import com.lzm.service.IBooksService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /**
     * 获取所有书籍数据
     * @return
     */
    @Override
    public String getAllBooks() {
        // 查询全部书籍数据
        List<Books> booksList = query().list();
        // 数据序列化
        String jsonStr = JSON.toJSONString(booksList);
        System.out.println("2:"+jsonStr.getClass());
        return jsonStr;
    }

}
