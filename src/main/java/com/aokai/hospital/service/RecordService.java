package com.aokai.hospital.service;

import com.aokai.hospital.model.dto.DoctorRecordInfo;
import com.aokai.hospital.model.dto.PatientRecordInfo;
import com.aokai.hospital.model.qo.GetRecordListReq;
import com.aokai.hospital.model.qo.InsertRecordReq;
import com.aokai.hospital.model.qo.UpdateRecordReq;
import com.github.pagehelper.PageInfo;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/18 18:32
 */
public interface RecordService {

    /**
     * 患者新增一条预约记录
     * @param insertRecordReq
     * @return
     */
    Boolean insertRecord(InsertRecordReq insertRecordReq);

    /**
     * 分页获取患者预约记录
     * @param getRecordListReq
     * @return
     */
    PageInfo<PatientRecordInfo> getRecordList(GetRecordListReq getRecordListReq);

    /**
     * 分页获取医生的患者预约记录
     * @param doctorId
     * @return
     */
    PageInfo<DoctorRecordInfo> getDoctorRecordList(Integer doctorId);

    /**
     * 医生同意或者拒绝患者预约
     * @param updateRecordReq
     * @return
     */
    Boolean updateRecord(UpdateRecordReq updateRecordReq);
}
