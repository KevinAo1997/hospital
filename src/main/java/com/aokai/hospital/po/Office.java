package com.aokai.hospital.po;

import javax.persistence.*;

@Table(name = "office")
public class Office {
    /**
     * 科室主键ID
     */
    @Id
    private Integer id;

    /**
     * 科室名称
     */
    @Column(name = "office_name")
    private String officeName;

    /**
     * 医生数量
     */
    @Column(name = "doctor_num")
    private Integer doctorNum;

    /**
     * 获取科室主键ID
     *
     * @return id - 科室主键ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置科室主键ID
     *
     * @param id 科室主键ID
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 获取医生数量
     *
     * @return doctor_num - 医生数量
     */
    public Integer getDoctorNum() {
        return doctorNum;
    }

    /**
     * 设置医生数量
     *
     * @param doctorNum 医生数量
     */
    public void setDoctorNum(Integer doctorNum) {
        this.doctorNum = doctorNum;
    }
}