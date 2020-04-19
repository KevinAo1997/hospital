package com.aokai.hospital.model.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/18 23:25
 */
@Data
@ToString
public class PatientRecordInfo implements Serializable {

    private static final long serialVersionUID = -8565444079128924230L;

    /**
     * 医生ID
     */
    private Integer doctorId;

    /**
     * 医生名称
     */
    private String doctorName;


    /**
     * 医生出诊费
     */
    private Integer fee;

    /**
     * 医生科室
     */
    private String doctorOffice;

    /**
     * 医生头像
     */
    private String picPath;

    /**
     * 工作日
     */
    private String workTime;

    /**
     * 时间段：医生工作日的上午或下午
     */
    private String period;

    /**
     * 预约记录的时间
     */
    private LocalDateTime recordTime;

    /**
     * 预约状态：1成功，0取消，2待处理
     */
    private Integer status;

}
