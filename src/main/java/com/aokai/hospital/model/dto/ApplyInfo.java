package com.aokai.hospital.model.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ApplyInfo implements Serializable {

    private static final long serialVersionUID = -4558590560599843374L;

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 医生id
     */
    private Integer doctorId;

    /**
     * 医生名称
     */
    private String doctorName;

    /**
     * 工作日id
     */
    private Integer workdayId;

    /**
     * 原因
     */
    private String reason;

    /**
     * 申请状态：申请出诊，申请停诊
     */
    private String request;

    /**
     * 状态：2等待处理，1同意，0拒绝
     */
    private Integer status;

    /**
     * 工作日
     */
    private String workTime;

    /**
     * 时间段：医生工作日的上午或下午
     */
    private String period;

    /**
     * 申请时间
     */
    private LocalDateTime applyTime;
}

