package com.aokai.hospital.model.qo;

import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/18 18:05
 */
@Data
@ToString
public class SearchDoctorNameReq implements Serializable {

    private static final long serialVersionUID = -2771348642650195559L;

    /**
     * 医生名字
     */
    private String docotrName;
}
