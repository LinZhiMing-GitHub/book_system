package com.lzm.controller;


import com.lzm.dto.Result;
import com.lzm.service.IBooksService;
import com.lzm.service.impl.BooksServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 林志明
 * @since 2024-05-31
 */
@RestController
@RequestMapping("/books")
public class BooksController {

    @Resource
    private IBooksService booksService;

    /**
     * 获取所有书籍数据
     * @return
     */
    @GetMapping("/getAllBooks")
    public String getAllBooks(){
        return booksService.getAllBooks();
    }

}

