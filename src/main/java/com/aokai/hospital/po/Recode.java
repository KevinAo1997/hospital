package com.aokai.hospital.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "recode")
public class Recode {
    @Id
    private Integer rid;

    /**
     * 病人id
     */
    private Integer pid;

    /**
     * 工作日id
     */
    private Integer wid;

    /**
     * 医生id
     */
    private Integer did;

    /**
     * 就诊序号
     */
    private Integer serialnumber;

    /**
     * 就诊日期
     */
    private Date visitdate;

    /**
     * 就诊上午或下午
     */
    private String visitnoon;

    /**
     * 就诊时间
     */
    private Date visittime;

    /**
     * 预约记录的时间
     */
    private Date ordertime;

    /**
     * 预约状态：成功，取消，完成，爽约
     */
    private String state;

    /**
     * @return rid
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * @param rid
     */
    public void setRid(Integer rid) {
        this.rid = rid;
    }

    /**
     * 获取病人id
     *
     * @return pid - 病人id
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置病人id
     *
     * @param pid 病人id
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 获取工作日id
     *
     * @return wid - 工作日id
     */
    public Integer getWid() {
        return wid;
    }

    /**
     * 设置工作日id
     *
     * @param wid 工作日id
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
     * 获取就诊序号
     *
     * @return serialnumber - 就诊序号
     */
    public Integer getSerialnumber() {
        return serialnumber;
    }

    /**
     * 设置就诊序号
     *
     * @param serialnumber 就诊序号
     */
    public void setSerialnumber(Integer serialnumber) {
        this.serialnumber = serialnumber;
    }

    /**
     * 获取就诊日期
     *
     * @return visitdate - 就诊日期
     */
    public Date getVisitdate() {
        return visitdate;
    }

    /**
     * 设置就诊日期
     *
     * @param visitdate 就诊日期
     */
    public void setVisitdate(Date visitdate) {
        this.visitdate = visitdate;
    }

    /**
     * 获取就诊上午或下午
     *
     * @return visitnoon - 就诊上午或下午
     */
    public String getVisitnoon() {
        return visitnoon;
    }

    /**
     * 设置就诊上午或下午
     *
     * @param visitnoon 就诊上午或下午
     */
    public void setVisitnoon(String visitnoon) {
        this.visitnoon = visitnoon == null ? null : visitnoon.trim();
    }

    /**
     * 获取就诊时间
     *
     * @return visittime - 就诊时间
     */
    public Date getVisittime() {
        return visittime;
    }

    /**
     * 设置就诊时间
     *
     * @param visittime 就诊时间
     */
    public void setVisittime(Date visittime) {
        this.visittime = visittime;
    }

    /**
     * 获取预约记录的时间
     *
     * @return ordertime - 预约记录的时间
     */
    public Date getOrdertime() {
        return ordertime;
    }

    /**
     * 设置预约记录的时间
     *
     * @param ordertime 预约记录的时间
     */
    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    /**
     * 获取预约状态：成功，取消，完成，爽约
     *
     * @return state - 预约状态：成功，取消，完成，爽约
     */
    public String getState() {
        return state;
    }

    /**
     * 设置预约状态：成功，取消，完成，爽约
     *
     * @param state 预约状态：成功，取消，完成，爽约
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}