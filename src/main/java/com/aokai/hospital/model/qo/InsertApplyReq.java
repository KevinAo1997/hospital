package com.aokai.hospital.model.qo;

import java.io.Serializable;
import javax.persistence.Column;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/19 19:36
 */
@Data
@ToString
public class InsertApplyReq implements Serializable {

    private static final long serialVersionUID = 5635439309533898072L;

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

}
