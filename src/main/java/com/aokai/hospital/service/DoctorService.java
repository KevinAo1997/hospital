package com.aokai.hospital.service;

import com.aokai.hospital.model.vo.RecommendDoctorResp;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/6 16:42
 */
public interface DoctorService {

    /**
     * 获取推荐医生信息
     * @return
     */
    RecommendDoctorResp getRecommendDoctor();
}
