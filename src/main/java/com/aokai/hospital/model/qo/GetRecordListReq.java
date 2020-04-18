package com.aokai.hospital.model.qo;

import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/18 23:21
 */
@Data
@ToString
public class GetRecordListReq extends PageReq implements Serializable {

    private static final long serialVersionUID = -5454360676882189115L;

    /**
     * 患者ID
     */
    private Integer patientId;
}
