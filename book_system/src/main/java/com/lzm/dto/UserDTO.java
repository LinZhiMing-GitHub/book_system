package com.lzm.dto;

import lombok.Data;

/**
 * 用户信息数据传输类
 */
@Data
public class UserDTO {
    private String username;
    private String password;
    private String phone;
}
