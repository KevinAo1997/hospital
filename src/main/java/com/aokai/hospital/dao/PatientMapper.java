package com.aokai.hospital.dao;

import com.aokai.hospital.po.Patient;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface PatientMapper extends Mapper<Patient> {

    /**
     * 获取用户信息
     * @param username
     * @param password
     * @return
     */
    Patient checkPatient(@Param("username") String username, @Param("password") String password);
}
