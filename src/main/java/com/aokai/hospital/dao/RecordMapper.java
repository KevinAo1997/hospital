package com.aokai.hospital.dao;

import com.aokai.hospital.po.Record;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface RecordMapper extends Mapper<Record> {

    /**
     * 获取患者预约记录
     * @param patientId
     * @return
     */
    List<Record> getRecordByPatientId(@Param("patientId") Integer patientId);

    /**
     * 获取医生的患者预约记录
     * @param doctorId
     * @return
     */
    List<Record> getRecordByDoctorId(@Param("doctorId") Integer doctorId);

    /**
     * 检查是否存在
     * @param doctorId
     * @param patientId
     * @param workTime
     * @param period
     * @return
     */
    Record checkRecord(
            @Param("doctorId") Integer doctorId, @Param("patientId") Integer patientId, @Param("workTime") String workTime, @Param("period") String period);
}
