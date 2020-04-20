package com.aokai.hospital.model.qo;

import java.io.Serializable;
import javax.persistence.Column;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/20 12:07
 */
@Data
@ToString
public class InsertDoctorReq implements Serializable {

    private static final long serialVersionUID = -2469765489588482100L;

    /**
     * 账号
     */
    private String username;

    /**
     * 医生名称
     */
    private String name;

    /**
     * 医生出诊费
     */
    private Integer fee;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private Byte age;

    /**
     * 科室名称
     */
    private String officeName;

    /**
     * 职位
     */
    private String career;

    /**
     * 介绍
     */
    private String description;



}
