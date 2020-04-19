package com.aokai.hospital.model.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

/**
 * Description :   用户信息
 *
 * @author : aokai
 * @date : Created in 2020/4/5 20:24
 */
@Data
@ToString
@Getter
public class User implements Serializable {

    private static final long serialVersionUID = -1627712534930187471L;

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 名称
     */
    private String name;

    /**
     * 患者邮箱
     */
    private String email;

    /**
     * 医生出诊费
     */
    private Integer fee;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private Byte age;

    /**
     * 科室名称
     */
    private String officeName;

    /**
     * 职位
     */
    private String career;

    /**
     * 介绍
     */
    private String description;

    /**
     * 头像
     */
    private String picpath;


}


