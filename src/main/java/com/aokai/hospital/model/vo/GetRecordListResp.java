package com.aokai.hospital.model.vo;

import com.aokai.hospital.model.dto.PatientRecordInfo;
import java.io.Serializable;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/18 23:35
 */
@Data
@ToString
public class GetRecordListResp implements Serializable {

    private static final long serialVersionUID = 6283748447718348846L;

    /**
     * 患者预约记录列表
     */
    private List<PatientRecordInfo> patientRecordInfoList;
}
