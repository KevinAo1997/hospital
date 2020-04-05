package com.aokai.hospital.po;

import javax.persistence.*;

@Table(name = "carstation")
public class Carstation {
    @Id
    @Column(name = "c_id")
    private Integer cId;

    @Column(name = "c_name")
    private String cName;

    @Column(name = "c_location")
    private String cLocation;

    @Column(name = "c_description")
    private String cDescription;

    @Column(name = "c_total")
    private Integer cTotal;

    @Column(name = "c_code")
    private String cCode;

    @Column(name = "c_price")
    private Double cPrice;

    @Column(name = "c_pricetime")
    private Double cPricetime;

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

    /**
     * @return c_name
     */
    public String getcName() {
        return cName;
    }

    /**
     * @param cName
     */
    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    /**
     * @return c_location
     */
    public String getcLocation() {
        return cLocation;
    }

    /**
     * @param cLocation
     */
    public void setcLocation(String cLocation) {
        this.cLocation = cLocation == null ? null : cLocation.trim();
    }

    /**
     * @return c_description
     */
    public String getcDescription() {
        return cDescription;
    }

    /**
     * @param cDescription
     */
    public void setcDescription(String cDescription) {
        this.cDescription = cDescription == null ? null : cDescription.trim();
    }

    /**
     * @return c_total
     */
    public Integer getcTotal() {
        return cTotal;
    }

    /**
     * @param cTotal
     */
    public void setcTotal(Integer cTotal) {
        this.cTotal = cTotal;
    }

    /**
     * @return c_code
     */
    public String getcCode() {
        return cCode;
    }

    /**
     * @param cCode
     */
    public void setcCode(String cCode) {
        this.cCode = cCode == null ? null : cCode.trim();
    }

    /**
     * @return c_price
     */
    public Double getcPrice() {
        return cPrice;
    }

    /**
     * @param cPrice
     */
    public void setcPrice(Double cPrice) {
        this.cPrice = cPrice;
    }

    /**
     * @return c_pricetime
     */
    public Double getcPricetime() {
        return cPricetime;
    }

    /**
     * @param cPricetime
     */
    public void setcPricetime(Double cPricetime) {
        this.cPricetime = cPricetime;
    }
}
