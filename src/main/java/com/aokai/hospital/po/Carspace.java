package com.aokai.hospital.po;

import javax.persistence.*;

@Table(name = "carspace")
public class Carspace {
    @Id
    @Column(name = "s_id")
    private Integer sId;

    @Column(name = "s_name")
    private String sName;

    @Column(name = "s_location")
    private String sLocation;

    @Column(name = "s_state")
    private Integer sState;

    @Column(name = "s_type")
    private Integer sType;

    @Column(name = "s_price")
    private Double sPrice;

    @Column(name = "s_pricetime")
    private Double sPricetime;

    @Column(name = "c_id")
    private Integer cId;

    /**
     * @return s_id
     */
    public Integer getsId() {
        return sId;
    }

    /**
     * @param sId
     */
    public void setsId(Integer sId) {
        this.sId = sId;
    }

    /**
     * @return s_name
     */
    public String getsName() {
        return sName;
    }

    /**
     * @param sName
     */
    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    /**
     * @return s_location
     */
    public String getsLocation() {
        return sLocation;
    }

    /**
     * @param sLocation
     */
    public void setsLocation(String sLocation) {
        this.sLocation = sLocation == null ? null : sLocation.trim();
    }

    /**
     * @return s_state
     */
    public Integer getsState() {
        return sState;
    }

    /**
     * @param sState
     */
    public void setsState(Integer sState) {
        this.sState = sState;
    }

    /**
     * @return s_type
     */
    public Integer getsType() {
        return sType;
    }

    /**
     * @param sType
     */
    public void setsType(Integer sType) {
        this.sType = sType;
    }

    /**
     * @return s_price
     */
    public Double getsPrice() {
        return sPrice;
    }

    /**
     * @param sPrice
     */
    public void setsPrice(Double sPrice) {
        this.sPrice = sPrice;
    }

    /**
     * @return s_pricetime
     */
    public Double getsPricetime() {
        return sPricetime;
    }

    /**
     * @param sPricetime
     */
    public void setsPricetime(Double sPricetime) {
        this.sPricetime = sPricetime;
    }

    /**
     * @return c_id
     */
    public Integer getcId() {
        return cId;
    }

    /**
     * @param cId
     */
    public void setcId(Integer cId) {
        this.cId = cId;
    }
}
