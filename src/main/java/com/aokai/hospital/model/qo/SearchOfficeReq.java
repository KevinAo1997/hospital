package com.aokai.hospital.model.qo;

import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/20 0:06
 */
@Data
@ToString
public class SearchOfficeReq extends PageReq implements Serializable {

    private static final long serialVersionUID = 3609548906418892787L;

    /**
     * 科室名称
     */
    private String officeName;
}
