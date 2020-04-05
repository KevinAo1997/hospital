package com.aokai.hospital.po;

import javax.persistence.*;

@Table(name = "office")
public class Office {
    @Id
    private String officename;

    private String description;

    private Integer doctornum;

    /**
     * @return officename
     */
    public String getOfficename() {
        return officename;
    }

    /**
     * @param officename
     */
    public void setOfficename(String officename) {
        this.officename = officename == null ? null : officename.trim();
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
     * @return doctornum
     */
    public Integer getDoctornum() {
        return doctornum;
    }

    /**
     * @param doctornum
     */
    public void setDoctornum(Integer doctornum) {
        this.doctornum = doctornum;
    }
}