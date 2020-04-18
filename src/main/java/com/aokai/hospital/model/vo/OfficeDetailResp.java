package com.aokai.hospital.model.vo;

import com.aokai.hospital.model.dto.DoctorInfo;
import java.io.Serializable;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/6 17:41
 */
@Data
@ToString
public class OfficeDetailResp implements Serializable {

    private static final long serialVersionUID = -4363320803193287589L;

    /**
     * 医生列表
     */
    private List<DoctorInfo> doctorInfoList;
}
