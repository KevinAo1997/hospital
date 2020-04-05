package com.aokai.hospital.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "integrity")
public class Integrity {
    @Id
    private Integer integrityid;

    /**
     * 病人id
     */
    private Integer pid;

    /**
     * 医生名字
     */
    private String dname;

    /**
     * 科室名字
     */
    private String office;

    /**
     * 诚信记录的时间
     */
    private Date time;

    /**
     * 原因
     */
    private String reason;

    /**
     * 分值
     */
    private Byte score;

    /**
     * @return integrityid
     */
    public Integer getIntegrityid() {
        return integrityid;
    }

    /**
     * @param integrityid
     */
    public void setIntegrityid(Integer integrityid) {
        this.integrityid = integrityid;
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
     * 获取医生名字
     *
     * @return dname - 医生名字
     */
    public String getDname() {
        return dname;
    }

    /**
     * 设置医生名字
     *
     * @param dname 医生名字
     */
    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    /**
     * 获取科室名字
     *
     * @return office - 科室名字
     */
    public String getOffice() {
        return office;
    }

    /**
     * 设置科室名字
     *
     * @param office 科室名字
     */
    public void setOffice(String office) {
        this.office = office == null ? null : office.trim();
    }

    /**
     * 获取诚信记录的时间
     *
     * @return time - 诚信记录的时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置诚信记录的时间
     *
     * @param time 诚信记录的时间
     */
    public void setTime(Date time) {
        this.time = time;
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
     * 获取分值
     *
     * @return score - 分值
     */
    public Byte getScore() {
        return score;
    }

    /**
     * 设置分值
     *
     * @param score 分值
     */
    public void setScore(Byte score) {
        this.score = score;
    }
}