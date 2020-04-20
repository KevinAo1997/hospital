package com.aokai.hospital.service.Impl;

import com.aokai.hospital.dao.DoctorMapper;
import com.aokai.hospital.dao.OfficeMapper;
import com.aokai.hospital.model.dto.DoctorInfo;
import com.aokai.hospital.model.dto.OfficeInfo;
import com.aokai.hospital.model.qo.InsertOfficeReq;
import com.aokai.hospital.model.qo.OfficeDetailReq;
import com.aokai.hospital.model.qo.SearchOfficeReq;
import com.aokai.hospital.po.Doctor;
import com.aokai.hospital.po.Office;
import com.aokai.hospital.service.OfficeService;
import com.aokai.hospital.utils.BeanUtil;
import com.github.pagehelper.PageInfo;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
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
    public PageInfo<OfficeInfo> getOfficeList() {
        List<OfficeInfo> officeInfoList;
        // 获取科室信息
        List<Office> officeList = officeMapper.selectAll();
        if (CollectionUtils.isEmpty(officeList)) {
            return null;
        }
        PageInfo<Office> officePageInfo = new PageInfo<>(officeList);
        officeInfoList = BeanUtil.copyPropertiesByFastJson(officePageInfo.getList(), OfficeInfo.class);

        PageInfo<OfficeInfo> officeInfoPageInfo = new PageInfo<>();
        BeanUtils.copyProperties(officePageInfo, officeInfoPageInfo);
        officeInfoPageInfo.setList(officeInfoList);
        return officeInfoPageInfo;
    }

    @Override
    public PageInfo<DoctorInfo> getOfficeDetailList(OfficeDetailReq officeDetailReq) {
        List<DoctorInfo> doctorInfoList;
        String officeName = officeDetailReq.getOfficeName();
        // 根据科室名称获取医生信息
        List<Doctor> doctorList = doctorMapper.getDoctorByOfficeName(officeName);
        if (CollectionUtils.isEmpty(doctorList)) {
            return null;
        }
        PageInfo<Doctor> doctorPageInfo = new PageInfo<>(doctorList);
        doctorInfoList = BeanUtil.copyPropertiesByFastJson(doctorPageInfo.getList(), DoctorInfo.class);

        PageInfo<DoctorInfo> doctorInfoPageInfo = new PageInfo<>();
        BeanUtils.copyProperties(doctorPageInfo, doctorInfoPageInfo);
        doctorInfoPageInfo.setList(doctorInfoList);
        return doctorInfoPageInfo;
    }

    @Override
    public List<Office> searchOffice(SearchOfficeReq searchOfficeReq) {
        String officeName = "%" + searchOfficeReq.getOfficeName() + "%";
        // 搜索科室
        List<Office> officeList = officeMapper.searchOffice(officeName);
        return officeList;
    }

    @Override
    public Boolean checkOffcieName(String officeName) {
        // 检查科室名称是否存在
        Office office = officeMapper.checkOffcieName(officeName);
        return office != null;
    }

    @Override
    public Boolean insertOffice(InsertOfficeReq insertOfficeReq) {
        Office office = new Office();
        office.setDoctorNum(0);
        office.setOfficeName(insertOfficeReq.getOfficeName());

        Integer insert = officeMapper.insert(office);
        return insert > 0;
    }
}
