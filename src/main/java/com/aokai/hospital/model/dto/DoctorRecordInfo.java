package com.aokai.hospital.model.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/19 20:09
 */
@Data
@ToString
public class DoctorRecordInfo implements Serializable {

    private static final long serialVersionUID = -4569051984023640755L;

    /**
     * 患者名称
     */
    private String patientName;

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
