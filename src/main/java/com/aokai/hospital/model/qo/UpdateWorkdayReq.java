package com.aokai.hospital.model.qo;

import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/20 12:30
 */
@Data
@ToString
public class UpdateWorkdayReq implements Serializable {

    private static final long serialVersionUID = -3351985697444944987L;

    /**
     * 工作日ID
     */
    private Integer workdayId;

    /**
     * 出诊或者停诊
     */
    private Integer status;
}
