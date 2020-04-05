package com.aokai.hospital.model.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   用户信息
 *
 * @author : aokai
 * @date : Created in 2020/4/5 20:24
 */
@Data
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = -1627712534930187471L;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }
}


