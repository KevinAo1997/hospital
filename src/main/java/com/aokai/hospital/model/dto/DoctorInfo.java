package com.aokai.hospital.model.dto;

import java.io.Serializable;
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
    private String doctorName;

    /**
     * 医生性别
     */
    private String sex;

    /**
     * 医生出诊费
     */
    private Integer fee;

    /**
     * 医生科室
     */
    private String doctorOffice;

    /**
     * 医生职位
     */
    private String doctorCareer;

    /**
     * 医生描述
     */
    private String doctorDesc;

    /**
     * 医生头像
     */
    private String picPath;
}
