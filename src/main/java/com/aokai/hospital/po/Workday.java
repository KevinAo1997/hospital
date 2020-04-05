package com.aokai.hospital.po;

import javax.persistence.*;

@Table(name = "workday")
public class Workday {
    @Id
    private Integer wid;

    /**
     * 医生id
     */
    private Integer did;

    /**
     * 医生工作日，星期几
     */
    private String worktime;

    /**
     * 医生工作日的上午或下午
     */
    private String ampm;

    /**
     * 医生这天上午或下午的号源数
     */
    private Integer nsnum;

    /**
     * 状态：已满，预约，停诊
     */
    private String state;

    /**
     * @return wid
     */
    public Integer getWid() {
        return wid;
    }

    /**
     * @param wid
     */
    public void setWid(Integer wid) {
        this.wid = wid;
    }

    /**
     * 获取医生id
     *
     * @return did - 医生id
     */
    public Integer getDid() {
        return did;
    }

    /**
     * 设置医生id
     *
     * @param did 医生id
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    /**
     * 获取医生工作日，星期几
     *
     * @return worktime - 医生工作日，星期几
     */
    public String getWorktime() {
        return worktime;
    }

    /**
     * 设置医生工作日，星期几
     *
     * @param worktime 医生工作日，星期几
     */
    public void setWorktime(String worktime) {
        this.worktime = worktime == null ? null : worktime.trim();
    }

    /**
     * 获取医生工作日的上午或下午
     *
     * @return ampm - 医生工作日的上午或下午
     */
    public String getAmpm() {
        return ampm;
    }

    /**
     * 设置医生工作日的上午或下午
     *
     * @param ampm 医生工作日的上午或下午
     */
    public void setAmpm(String ampm) {
        this.ampm = ampm == null ? null : ampm.trim();
    }

    /**
     * 获取医生这天上午或下午的号源数
     *
     * @return nsnum - 医生这天上午或下午的号源数
     */
    public Integer getNsnum() {
        return nsnum;
    }

    /**
     * 设置医生这天上午或下午的号源数
     *
     * @param nsnum 医生这天上午或下午的号源数
     */
    public void setNsnum(Integer nsnum) {
        this.nsnum = nsnum;
    }

    /**
     * 获取状态：已满，预约，停诊
     *
     * @return state - 状态：已满，预约，停诊
     */
    public String getState() {
        return state;
    }

    /**
     * 设置状态：已满，预约，停诊
     *
     * @param state 状态：已满，预约，停诊
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}