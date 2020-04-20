package com.aokai.hospital.model.qo;

import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/20 21:01
 */
@Data
@ToString
public class InsertOfficeReq implements Serializable {

    private static final long serialVersionUID = -3462601646297309840L;

    /**
     * 科室名称
     */
    private String officeName;

}
