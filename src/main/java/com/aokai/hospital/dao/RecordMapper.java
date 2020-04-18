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
}
