package com.aokai.hospital.model.qo;

import java.io.Serializable;
import javax.annotation.security.DenyAll;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/19 20:21
 */
@Data
@ToString
public class UpdateRecordReq implements Serializable {

    private static final long serialVersionUID = 3540984917945602927L;


    /**
     * 预约记录ID
     */
    private Integer recordId;

    /**
     * 状态：2等待处理，1同意，0拒绝
     */
    private Integer status;


}
