package com.aokai.hospital.service;

import com.aokai.hospital.model.qo.SearchDoctorNameReq;
import com.aokai.hospital.model.vo.RecommendDoctorResp;
import com.aokai.hospital.po.Doctor;
import java.util.List;

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

    /**
     * 搜索医生名字
     * @param searchDoctorNameReq
     * @return
     */
    List<Doctor> searchDoctor(SearchDoctorNameReq searchDoctorNameReq);

    /**
     * 获取医生
     * @param doctorId
     * @return
     */
    Doctor getDoctor(Integer doctorId);
}
