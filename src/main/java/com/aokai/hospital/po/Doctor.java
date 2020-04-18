package com.aokai.hospital.po;

import javax.persistence.*;

@Table(name = "doctor")
public class Doctor {
    /**
     * 医生主键ID
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
     * 医生名称
     */
    private String name;

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
    @Column(name = "office_name")
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

    /**
     * 获取医生主键ID
     *
     * @return id - 医生主键ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置医生主键ID
     *
     * @param id 医生主键ID
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
     * 获取医生名称
     *
     * @return name - 医生名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置医生名称
     *
     * @param name 医生名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取医生出诊费
     *
     * @return fee - 医生出诊费
     */
    public Integer getFee() {
        return fee;
    }

    /**
     * 设置医生出诊费
     *
     * @param fee 医生出诊费
     */
    public void setFee(Integer fee) {
        this.fee = fee;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Byte getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Byte age) {
        this.age = age;
    }

    /**
     * 获取科室名称
     *
     * @return office_name - 科室名称
     */
    public String getOfficeName() {
        return officeName;
    }

    /**
     * 设置科室名称
     *
     * @param officeName 科室名称
     */
    public void setOfficeName(String officeName) {
        this.officeName = officeName == null ? null : officeName.trim();
    }

    /**
     * 获取职位
     *
     * @return career - 职位
     */
    public String getCareer() {
        return career;
    }

    /**
     * 设置职位
     *
     * @param career 职位
     */
    public void setCareer(String career) {
        this.career = career == null ? null : career.trim();
    }

    /**
     * 获取介绍
     *
     * @return description - 介绍
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置介绍
     *
     * @param description 介绍
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取头像
     *
     * @return picpath - 头像
     */
    public String getPicpath() {
        return picpath;
    }

    /**
     * 设置头像
     *
     * @param picpath 头像
     */
    public void setPicpath(String picpath) {
        this.picpath = picpath == null ? null : picpath.trim();
    }
}