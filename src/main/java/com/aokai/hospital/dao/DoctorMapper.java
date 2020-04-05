package com.aokai.hospital.dao;

import com.aokai.hospital.po.Doctor;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface DoctorMapper extends Mapper<Doctor> {

    /**
     * 获取用户信息
     * @param username
     * @param password
     * @return
     */
    Doctor checkDoctor(@Param("username") String username, @Param("password") String password);
}