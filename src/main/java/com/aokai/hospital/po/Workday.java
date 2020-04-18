package com.aokai.hospital.po;

import javax.persistence.*;

@Table(name = "workday")
public class Workday {
    /**
     * 主键ID
     */
    @Id
    private Integer id;

    /**
     * 医生id
     */
    @Column(name = "doctor_id")
    private Integer doctorId;

    /**
     * 工作日
     */
    @Column(name = "work_time")
    private String workTime;

    /**
     * 时间段：医生工作日的上午或下午
     */
    private String period;

    /**
     * 状态:1预约，0停诊
     */
    private Integer status;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取医生id
     *
     * @return doctor_id - 医生id
     */
    public Integer getDoctorId() {
        return doctorId;
    }

    /**
     * 设置医生id
     *
     * @param doctorId 医生id
     */
    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    /**
     * 获取工作日
     *
     * @return work_time - 工作日
     */
    public String getWorkTime() {
        return workTime;
    }

    /**
     * 设置工作日
     *
     * @param workTime 工作日
     */
    public void setWorkTime(String workTime) {
        this.workTime = workTime == null ? null : workTime.trim();
    }

    /**
     * 获取时间段：医生工作日的上午或下午
     *
     * @return period - 时间段：医生工作日的上午或下午
     */
    public String getPeriod() {
        return period;
    }

    /**
     * 设置时间段：医生工作日的上午或下午
     *
     * @param period 时间段：医生工作日的上午或下午
     */
    public void setPeriod(String period) {
        this.period = period == null ? null : period.trim();
    }

    /**
     * 获取状态:1预约，0停诊
     *
     * @return status - 状态:1预约，0停诊
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态:1预约，0停诊
     *
     * @param status 状态:1预约，0停诊
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}