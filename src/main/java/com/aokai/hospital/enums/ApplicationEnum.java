package com.aokai.hospital.enums;

import lombok.Getter;

/**
 * Description :   业务结果状态码
 *
 * @author : aokai
 * @date : Created in 2020/4/5 20:36
 */
@Getter
public enum ApplicationEnum {

    SUCCESS("1","业务执行成功"),



    PARAMETER_BIND_FAIL("0","参数绑定失败"),
    PARAMETER_VERIFY_FAIL("0","参数校验失败"),

    USER_NAME_REPETITION("0","用户名已存在"),
    USER_EMAIL_REPETITION("0", "邮箱已存在"),
    USER_OR_PWD_ERR("0","用户名或密码错误"),
    REGISTER_FAILED("0", "注册失败"),


    NO_LOGIN("0","未登陆"),
    YET_LOGIN("1","已登陆"),
    USER_NO_EXIST("0","用户不存在"),
    PASSWORD_ERR("0","密码错误"),

    OLD_PASSWORD_ERR("0","原密码错误"),

    REQUEST_FREQUENTLY("0","请求太过频繁"),

    TOKEN_INVALID("0", "token失效"),


    FAIL("0","业务执行失败"),

    RECORD_IS_EXIST("0","已经预约");


    /**
     * 设计原则
     * 2xxx 业务执行成功
     * 4xxx 由于用户导致的错误，比如注册时，重复注册导致的注册失败
     * 5xxx 由于系统原因导致的错误
     */
    private String code;

    private String message;

    ApplicationEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

}
