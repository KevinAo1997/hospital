package com.aokai.hospital.po;

import javax.persistence.*;

@Table(name = "doctor")
public class Doctor {
    @Id
    private Integer did;

    private String account;

    private String password;

    private String dname;

    /**
     * 医生出诊费
     */
    private Integer fee;

    private String gender;

    private Byte age;

    private String office;

    private String room;

    private String career;

    private String description;

    private String picpath;

    /**
     * @return did
     */
    public Integer getDid() {
        return did;
    }

    /**
     * @param did
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    /**
     * @return account
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return dname
     */
    public String getDname() {
        return dname;
    }

    /**
     * @param dname
     */
    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
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
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * @return age
     */
    public Byte getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Byte age) {
        this.age = age;
    }

    /**
     * @return office
     */
    public String getOffice() {
        return office;
    }

    /**
     * @param office
     */
    public void setOffice(String office) {
        this.office = office == null ? null : office.trim();
    }

    /**
     * @return room
     */
    public String getRoom() {
        return room;
    }

    /**
     * @param room
     */
    public void setRoom(String room) {
        this.room = room == null ? null : room.trim();
    }

    /**
     * @return career
     */
    public String getCareer() {
        return career;
    }

    /**
     * @param career
     */
    public void setCareer(String career) {
        this.career = career == null ? null : career.trim();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * @return picpath
     */
    public String getPicpath() {
        return picpath;
    }

    /**
     * @param picpath
     */
    public void setPicpath(String picpath) {
        this.picpath = picpath == null ? null : picpath.trim();
    }
}