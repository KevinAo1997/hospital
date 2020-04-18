package com.aokai.hospital.service.Impl;

import com.aokai.hospital.dao.DoctorMapper;
import com.aokai.hospital.dao.OfficeMapper;
import com.aokai.hospital.model.dto.DoctorInfo;
import com.aokai.hospital.model.qo.SearchDoctorNameReq;
import com.aokai.hospital.model.vo.RecommendDoctorResp;
import com.aokai.hospital.po.Doctor;
import com.aokai.hospital.service.DoctorService;
import java.util.LinkedList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/6 16:43
 */
@Service
@Slf4j
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorMapper doctorMapper;

    @Autowired
    private OfficeMapper officeMapper;

    @Override
    public RecommendDoctorResp getRecommendDoctor() {
        RecommendDoctorResp recommendDoctorResp = new RecommendDoctorResp();
        List<DoctorInfo> doctorInfoList = new LinkedList<>();
        // 获取医生信息
        List<Doctor> doctorList = doctorMapper.selectAll();
        if (CollectionUtils.isEmpty(doctorList)) {
            return null;
        }
        // 遍历
        for (Doctor doctor : doctorList) {
            DoctorInfo doctorInfo = new DoctorInfo();
            doctorInfo.setDoctorCareer(doctor.getCareer());
            doctorInfo.setDoctorName(doctor.getName());
            doctorInfo.setDoctorOffice(doctor.getOfficeName());
            doctorInfo.setDoctorDesc(doctor.getDescription());
            doctorInfo.setPicPath(doctor.getPicpath());

            doctorInfoList.add(doctorInfo);
        }
        recommendDoctorResp.setDoctorInfoList(doctorInfoList);
        return recommendDoctorResp;
    }

    @Override
    public List<Doctor> searchDoctor(SearchDoctorNameReq searchDoctorNameReq) {
        String doctorName = "%" + searchDoctorNameReq.getDocotrName();
        // 搜索医生
        List<Doctor> doctorList = doctorMapper.searchDoctor(doctorName);
        return doctorList;
    }

    @Override
    public Doctor getDoctor(Integer doctorId) {
        // 获取医生信息
        Doctor doctor = doctorMapper.selectByPrimaryKey(doctorId);
        return doctor;
    }


}
