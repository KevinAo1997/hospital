package com.aokai.hospital.model.qo;

import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/18 18:27
 */
@Data
@ToString
public class GetApplyReq extends PageReq implements Serializable {

    private static final long serialVersionUID = -8093125791185585723L;

    /**
     * 医生ID
     */
    private Integer doctorId;
}
