package com.aokai.hospital.dao;

import com.aokai.hospital.po.Workday;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface WorkdayMapper extends Mapper<Workday> {

    /**
     * 获取医生工作日信息
     * @return
     * @param doctorId
     */
    List<Workday> getWorkDay(@Param("doctorId") Integer doctorId);
}
