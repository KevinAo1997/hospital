package com.aokai.hospital.dao;

import com.aokai.hospital.po.Apply;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface ApplyMapper extends Mapper<Apply> {

    /**
     * 获取医生申请信息
     * @param doctorId
     * @return
     */
    List<Apply> getApply(@Param("doctorId") Integer doctorId);
}
