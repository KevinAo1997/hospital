package com.aokai.hospital.po;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.*;

@Table(name = "record")
public class Record {
    /**
     * 主键ID
     */
    @Id
    private Integer id;

    /**
     * 患者id
     */
    @Column(name = "patient_id")
    private Integer patientId;

    /**
     * 患者名称
     */
    @Column(name = "patient_name")
    private String patientName;

    /**
     * 工作日id
     */
    @Column(name = "workday_id")
    private Integer workdayId;

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
     * 预约记录的时间
     */
    @Column(name = "record_time")
    private LocalDateTime recordTime;

    /**
     * 预约状态：1成功，0取消，2待处理
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
     * 获取患者id
     *
     * @return patient_id - 患者id
     */
    public Integer getPatientId() {
        return patientId;
    }

    /**
     * 设置患者id
     *
     * @param patientId 患者id
     */
    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    /**
     * 获取患者名称
     *
     * @return patient_name - 患者名称
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * 设置患者名称
     *
     * @param patientName 患者名称
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
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
     * 获取预约记录的时间
     *
     * @return record_time - 预约记录的时间
     */
    public LocalDateTime getRecordTime() {
        return recordTime;
    }

    /**
     * 设置预约记录的时间
     *
     * @param recordTime 预约记录的时间
     */
    public void setRecordTime(LocalDateTime recordTime) {
        this.recordTime = recordTime;
    }

    /**
     * 获取预约状态：1成功，0取消，2待处理
     *
     * @return status - 预约状态：1成功，0取消，2待处理
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置预约状态：1成功，0取消，2待处理
     *
     * @param status 预约状态：1成功，0取消，2待处理
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}
