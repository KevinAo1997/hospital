package com.aokai.hospital.service.Impl;

import com.aokai.hospital.dao.DoctorMapper;
import com.aokai.hospital.dao.OfficeMapper;
import com.aokai.hospital.model.dto.DoctorInfo;
import com.aokai.hospital.model.dto.OfficeInfo;
import com.aokai.hospital.model.qo.OfficeDetailReq;
import com.aokai.hospital.model.vo.OfficeDetailResp;
import com.aokai.hospital.model.vo.OfficeResp;
import com.aokai.hospital.po.Doctor;
import com.aokai.hospital.po.Office;
import com.aokai.hospital.service.OfficeService;
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
 * @date : Created in 2020/4/6 17:19
 */
@Slf4j
@Service
public class OfficeServiceImpl implements OfficeService {

    @Autowired
    private OfficeMapper officeMapper;

    @Autowired
    private DoctorMapper doctorMapper;


    @Override
    public OfficeResp getOfficeList() {
        OfficeResp officeResp = new OfficeResp();
        List<OfficeInfo> officeInfoList = new LinkedList<>();
        // 获取科室信息
        List<Office> officeList = officeMapper.selectAll();
        if (CollectionUtils.isEmpty(officeList)) {
            return null;
        }
        // 遍历
        for (Office office : officeList) {
            OfficeInfo officeInfo = new OfficeInfo();
            officeInfo.setOfficeName(office.getOfficeName());
            officeInfo.setDoctorNum(office.getDoctorNum());

            officeInfoList.add(officeInfo);
        }
        officeResp.setOfficeInfoList(officeInfoList);
        return officeResp;
    }

    @Override
    public OfficeDetailResp getOfficeDetailList(OfficeDetailReq officeDetailReq) {
        OfficeDetailResp officeDetailResp = new OfficeDetailResp();
        List<DoctorInfo> doctorInfoList = new LinkedList<>();
        String officeName = officeDetailReq.getOfficeName();
        // 根据科室名称获取医生信息
        List<Doctor> doctorList = doctorMapper.getDoctorByOfficeName(officeName);
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
            doctorInfo.setFee(doctor.getFee());
            doctorInfo.setSex(doctor.getSex());

            doctorInfoList.add(doctorInfo);
        }
        officeDetailResp.setDoctorInfoList(doctorInfoList);
        return officeDetailResp;
    }
}
