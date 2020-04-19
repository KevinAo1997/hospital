package com.aokai.hospital.model.qo;

import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/19 20:00
 */
@Data
@ToString
public class DeleteApplyReq implements Serializable {

    private static final long serialVersionUID = -3406671334396052050L;

    /**
     * 申请ID
     */
    private Integer applyId;
}
