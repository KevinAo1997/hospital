package com.aokai.hospital.model.vo;

import com.aokai.hospital.model.dto.DoctorInfo;
import java.io.Serializable;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   推荐医生结果参数
 *
 * @author : aokai
 * @date : Created in 2020/4/6 16:47
 */
@Data
@ToString
public class RecommendDoctorResp implements Serializable {

    private static final long serialVersionUID = 5068161940187910861L;

    /**
     * 推荐医生信息
     */
    private List<DoctorInfo> doctorInfoList;

}
