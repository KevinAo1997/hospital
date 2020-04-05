package com.aokai.hospital.model.qo;

import com.aokai.hospital.enums.UserTypeEnum;
import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .用户登录请求参数
 *
 * @author : aokai
 * @date : Created in 2020/4/5 20:32
 */
@Data
@ToString
public class UserReq implements Serializable {

    private static final long serialVersionUID = -4464556095429559168L;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户类型(枚举)
     */
    private UserTypeEnum.UserType userType;
}
