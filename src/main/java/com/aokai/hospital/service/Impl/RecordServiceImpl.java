package com.aokai.hospital.service.Impl;

import com.aokai.hospital.dao.DoctorMapper;
import com.aokai.hospital.dao.RecordMapper;
import com.aokai.hospital.model.dto.DoctorRecordInfo;
import com.aokai.hospital.model.dto.PatientRecordInfo;
import com.aokai.hospital.model.qo.GetRecordListReq;
import com.aokai.hospital.model.qo.InsertRecordReq;
import com.aokai.hospital.model.qo.UpdateRecordReq;
import com.aokai.hospital.po.Apply;
import com.aokai.hospital.po.Doctor;
import com.aokai.hospital.po.Record;
import com.aokai.hospital.service.RecordService;
import com.aokai.hospital.utils.BeanUtil;
import com.github.pagehelper.PageInfo;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/18 18:33
 */
@Slf4j
@Service
public class RecordServiceImpl implements RecordService {

    @Autowired
    private RecordMapper recordMapper;

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public Boolean insertRecord(InsertRecordReq insertRecordReq) {
        Record record = new Record();
        BeanUtils.copyProperties(insertRecordReq, record);
        record.setStatus(2);
        record.setRecordTime(LocalDateTime.now());
        // 新增预约记录
        Integer insertRecord = recordMapper.insert(record);

        return insertRecord > 0;
    }

    @Override
    public PageInfo<PatientRecordInfo> getRecordList(GetRecordListReq getRecordListReq) {
        List<PatientRecordInfo> patientRecordInfoList;
        // 获取患者预约记录
        List<Record> recordList = recordMapper.getRecordByPatientId(getRecordListReq.getPatientId());
        if (CollectionUtils.isEmpty(recordList)) {
            return new PageInfo<>();
        }
        PageInfo<Record> recordPageInfo = new PageInfo<>(recordList);

        // 赋值到分页里面
        patientRecordInfoList = BeanUtil.copyPropertiesByFastJson(recordPageInfo.getList(), PatientRecordInfo.class);
        // 遍历循环预约记录，获取医生信息
        for (Record record : recordList) {
            Doctor doctor = doctorMapper.selectByPrimaryKey(record.getDoctorId());
            if (doctor == null) {
                continue;
            }
            Optional<PatientRecordInfo> patientRecordInfoOptional = patientRecordInfoList.stream().filter(o -> o.getDoctorId().equals(doctor.getId())).findAny();
            if (patientRecordInfoOptional.isPresent()) {
                PatientRecordInfo patientRecordInfo = patientRecordInfoOptional.get();
                patientRecordInfo.setDoctorName(doctor.getName());
                patientRecordInfo.setDoctorOffice(doctor.getOfficeName());
                patientRecordInfo.setPicPath(doctor.getPicpath());
                patientRecordInfo.setFee(doctor.getFee());
            }
        }
        PageInfo<PatientRecordInfo> patientRecordInfoPageInfo = new PageInfo<>();
        BeanUtils.copyProperties(recordPageInfo, patientRecordInfoPageInfo);
        patientRecordInfoPageInfo.setList(patientRecordInfoList);
        return patientRecordInfoPageInfo;
    }

    @Override
    public PageInfo<DoctorRecordInfo> getDoctorRecordList(Integer doctorId) {
        List<DoctorRecordInfo> doctorRecordInfoList;
        // 获取医生的患者预约记录
        List<Record> recordList = recordMapper.getRecordByDoctorId(doctorId);
        if (CollectionUtils.isEmpty(recordList)) {
            return new PageInfo<>();
        }
        PageInfo<Record> recordPageInfo = new PageInfo<>(recordList);
        // 复制
        doctorRecordInfoList = BeanUtil.copyPropertiesByFastJson(recordPageInfo.getList(), DoctorRecordInfo.class);
        PageInfo<DoctorRecordInfo> doctorRecordInfoPageInfo = new PageInfo<>();
        BeanUtils.copyProperties(recordPageInfo, doctorRecordInfoPageInfo);

        doctorRecordInfoPageInfo.setList(doctorRecordInfoList);
        return doctorRecordInfoPageInfo;
    }

    @Override
    public Boolean updateRecord(UpdateRecordReq updateRecordReq) {
        Record record = new Record();
        record.setStatus(updateRecordReq.getStatus());
        record.setId(updateRecordReq.getRecordId());

        Integer update = recordMapper.updateByPrimaryKeySelective(record);
        return update > 0;
    }
}
