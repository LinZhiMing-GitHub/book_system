package com.lzm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 返回结果类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Boolean success;
    private String errorMsg;
    private Object data;
    private Long total;

    public static com.lzm.dto.Result ok(){
        return new com.lzm.dto.Result(true, null, null, null);
    }
    public static com.lzm.dto.Result ok(Object data){
        return new com.lzm.dto.Result(true, null, data, null);
    }
    public static com.lzm.dto.Result ok(List<?> data, Long total){
        return new com.lzm.dto.Result(true, null, data, total);
    }
    public static com.lzm.dto.Result fail(String errorMsg){
        return new com.lzm.dto.Result(false, errorMsg, null, null);
    }
}
