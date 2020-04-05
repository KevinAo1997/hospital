package com.aokai.hospital.model.qo;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/5 23:39
 */
@Data
@ToString
public class RegisterReq implements Serializable {

    private static final long serialVersionUID = 8944090591960672990L;

    /**
     * 用户账号
     */
    @NotBlank
    private String account;

    /**
     * 用户密码
     */
    @NotBlank
    private String password;

    /**
     * 邮箱
     */
    @NotBlank
    private String email;

    /**
     * 用户名称
     */
    @NotBlank
    private String name;

}
