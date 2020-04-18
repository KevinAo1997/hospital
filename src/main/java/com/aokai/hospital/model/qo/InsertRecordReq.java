package com.aokai.hospital.model.qo;

import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/18 23:10
 */
@Data
@ToString
public class InsertRecordReq implements Serializable {

    private static final long serialVersionUID = -4424173672773492310L;

    /**
     * 患者ID
     */
    private Integer patientId;

    /**
     * 患者名称
     */
    private String patientName;

    /**
     * 工作日ID
     */
    private Integer workdayId;

    /**
     * 医生ID
     */
    private Integer doctorId;

    /**
     * 工作日
     */
    private String workTime;

    /**
     * 时间段
     */
    private String period;


}
