package com.aokai.hospital.model.qo;

import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/18 18:15
 */
@Data
@ToString
public class GetDoctorReq implements Serializable {

    private static final long serialVersionUID = -3844226683065009391L;

    /**
     * 医生ID
     */
    private Integer doctorId;
}
