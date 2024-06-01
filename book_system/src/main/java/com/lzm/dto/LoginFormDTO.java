package com.lzm.dto;

import lombok.Data;

/**
 * 用户数据传输类
 */
@Data
public class LoginFormDTO {
    private String code;
    private String phone;
    private String username;
    private String password;
}
