package com.aokai.hospital.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "carorder")
public class Carorder {
    @Id
    private Integer id;

    private String province;

    @Column(name = "carNumber")
    private String carnumber;

    @Column(name = "customerName")
    private String customername;

    @Column(name = "customerPhone")
    private String customerphone;

    @Column(name = "startTime")
    private Date starttime;

    @Column(name = "endTime")
    private Date endtime;

    private Double cost;

    private Double time;

    private Integer state;

    private Integer cid;

    private Integer sid;

    private Integer uid;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * @return carNumber
     */
    public String getCarnumber() {
        return carnumber;
    }

    /**
     * @param carnumber
     */
    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber == null ? null : carnumber.trim();
    }

    /**
     * @return customerName
     */
    public String getCustomername() {
        return customername;
    }

    /**
     * @param customername
     */
    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    /**
     * @return customerPhone
     */
    public String getCustomerphone() {
        return customerphone;
    }

    /**
     * @param customerphone
     */
    public void setCustomerphone(String customerphone) {
        this.customerphone = customerphone == null ? null : customerphone.trim();
    }

    /**
     * @return startTime
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * @param starttime
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * @return endTime
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * @param endtime
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * @return cost
     */
    public Double getCost() {
        return cost;
    }

    /**
     * @param cost
     */
    public void setCost(Double cost) {
        this.cost = cost;
    }

    /**
     * @return time
     */
    public Double getTime() {
        return time;
    }

    /**
     * @param time
     */
    public void setTime(Double time) {
        this.time = time;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return cid
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * @param cid
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * @return sid
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * @param sid
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
