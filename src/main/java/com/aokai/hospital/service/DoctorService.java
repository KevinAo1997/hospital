package com.aokai.hospital.service;

import com.aokai.hospital.model.dto.DoctorInfo;
import com.aokai.hospital.model.qo.InsertDoctorReq;
import com.aokai.hospital.model.qo.SearchDoctorNameReq;
import com.aokai.hospital.model.vo.RecommendDoctorResp;
import com.aokai.hospital.po.Doctor;
import com.github.pagehelper.PageInfo;
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
    PageInfo<DoctorInfo> getRecommendDoctor();

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

    /**
     * 新增医生
     * @param insertDoctorReq
     * @return
     */
    Boolean insertDoctor(InsertDoctorReq insertDoctorReq);

    /**
     * 判断账号是否存在
     * @param username
     * @return
     */
    Boolean checkName(String username);
}
