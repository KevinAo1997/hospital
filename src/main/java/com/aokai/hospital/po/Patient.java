package com.aokai.hospital.po;

import javax.persistence.*;

@Table(name = "patient")
public class Patient {
    /**
     * 患者主键ID
     */
    @Id
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
     * 邮箱
     */
    private String email;

    /**
     * 患者名称
     */
    private String name;

    /**
     * 获取患者主键ID
     *
     * @return id - 患者主键ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置患者主键ID
     *
     * @param id 患者主键ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取账号
     *
     * @return username - 账号
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置账号
     *
     * @param username 账号
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取患者名称
     *
     * @return name - 患者名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置患者名称
     *
     * @param name 患者名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}