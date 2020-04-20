package com.aokai.hospital.model.qo;

import java.io.Serializable;
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
public class UpdateApplyReq implements Serializable {

    private static final long serialVersionUID = 3540984917945602927L;


    /**
     * 申请记录ID
     */
    private Integer applyId;

    /**
     * 状态：2等待处理，1同意，0拒绝
     */
    private Integer status;


}
