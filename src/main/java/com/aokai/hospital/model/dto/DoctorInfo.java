package com.aokai.hospital.model.dto;

import java.io.Serializable;
import javax.persistence.Column;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/6 16:55
 */
@Data
@ToString
public class DoctorInfo implements Serializable {

    private static final long serialVersionUID = -506954350199885357L;

    /**
     * 医生名称
     */
    private String name;

    /**
     * 医生性别
     */
    private String sex;

    /**
     * 年龄
     */
    private Byte age;

    /**
     * 医生出诊费
     */
    private Integer fee;

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

    /**
     * 头像
     */
    private String picpath;
}
