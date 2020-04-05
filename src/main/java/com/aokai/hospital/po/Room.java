package com.aokai.hospital.po;

import javax.persistence.*;

@Table(name = "room")
public class Room {
    @Id
    private Integer id;

    private String officename;

    private String roomname;

    private Integer doctornum;

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
     * @return roomname
     */
    public String getRoomname() {
        return roomname;
    }

    /**
     * @param roomname
     */
    public void setRoomname(String roomname) {
        this.roomname = roomname == null ? null : roomname.trim();
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