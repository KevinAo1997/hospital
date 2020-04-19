package com.aokai.hospital.po;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.*;

@Table(name = "apply")
public class Apply {
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
     * 医生名称
     */
    @Column(name = "doctor_name")
    private String doctorName;

    /**
     * 工作日id
     */
    @Column(name = "workday_id")
    private Integer workdayId;

    /**
     * 原因
     */
    private String reason;

    /**
     * 申请状态：申请出诊，申请停诊
     */
    private String request;

    /**
     * 状态：2等待处理，1同意，0拒绝
     */
    private Integer status;

    @Column(name = "apply_time")
    private LocalDateTime applyTime;

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
     * 获取医生名称
     *
     * @return doctor_name - 医生名称
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * 设置医生名称
     *
     * @param doctorName 医生名称
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    /**
     * 获取工作日id
     *
     * @return workday_id - 工作日id
     */
    public Integer getWorkdayId() {
        return workdayId;
    }

    /**
     * 设置工作日id
     *
     * @param workdayId 工作日id
     */
    public void setWorkdayId(Integer workdayId) {
        this.workdayId = workdayId;
    }

    /**
     * 获取原因
     *
     * @return reason - 原因
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置原因
     *
     * @param reason 原因
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * 获取申请状态：申请出诊，申请停诊
     *
     * @return request - 申请状态：申请出诊，申请停诊
     */
    public String getRequest() {
        return request;
    }

    /**
     * 设置申请状态：申请出诊，申请停诊
     *
     * @param request 申请状态：申请出诊，申请停诊
     */
    public void setRequest(String request) {
        this.request = request == null ? null : request.trim();
    }

    /**
     * 获取状态：2等待处理，1同意，0拒绝
     *
     * @return status - 状态：2等待处理，1同意，0拒绝
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态：2等待处理，1同意，0拒绝
     *
     * @param status 状态：2等待处理，1同意，0拒绝
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return apply_time
     */
    public LocalDateTime getApplyTime() {
        return applyTime;
    }

    /**
     * @param applyTime
     */
    public void setApplyTime(LocalDateTime applyTime) {
        this.applyTime = applyTime;
    }
}
