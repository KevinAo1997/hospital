package com.aokai.hospital.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "apply")
public class Apply {
    @Id
    private Integer aid;

    /**
     * 医生id
     */
    private Integer did;

    private String dname;

    private Integer wid;

    /**
     * 原因
     */
    private String reason;

    /**
     * 医生这天上午或下午的号源数
     */
    private Date applytime;

    /**
     * 状态：申请出诊，申请停诊
     */
    private String request;

    /**
     * 状态：等待处理，同意，拒绝
     */
    private String state;

    /**
     * @return aid
     */
    public Integer getAid() {
        return aid;
    }

    /**
     * @param aid
     */
    public void setAid(Integer aid) {
        this.aid = aid;
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
     * 获取医生这天上午或下午的号源数
     *
     * @return applytime - 医生这天上午或下午的号源数
     */
    public Date getApplytime() {
        return applytime;
    }

    /**
     * 设置医生这天上午或下午的号源数
     *
     * @param applytime 医生这天上午或下午的号源数
     */
    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    /**
     * 获取状态：申请出诊，申请停诊
     *
     * @return request - 状态：申请出诊，申请停诊
     */
    public String getRequest() {
        return request;
    }

    /**
     * 设置状态：申请出诊，申请停诊
     *
     * @param request 状态：申请出诊，申请停诊
     */
    public void setRequest(String request) {
        this.request = request == null ? null : request.trim();
    }

    /**
     * 获取状态：等待处理，同意，拒绝
     *
     * @return state - 状态：等待处理，同意，拒绝
     */
    public String getState() {
        return state;
    }

    /**
     * 设置状态：等待处理，同意，拒绝
     *
     * @param state 状态：等待处理，同意，拒绝
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}