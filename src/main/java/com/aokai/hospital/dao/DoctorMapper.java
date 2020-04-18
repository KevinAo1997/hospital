package com.aokai.hospital.dao;

import com.aokai.hospital.po.Doctor;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface DoctorMapper extends Mapper<Doctor> {

    /**
     * 获取用户
     * @param username
     * @param password
     * @return
     */
    Doctor checkDoctor(@Param("username") String username, @Param("password") String password);

    /**
     * 根据科室名称获取医生信息
     * @param officeName
     * @return
     */
    List<Doctor> getDoctorByOfficeName(@Param("officeName") String officeName);

    /**
     * 搜索医生
     * @param docotrName
     * @return
     */
    List<Doctor> searchDoctor(@Param("docotrName") String docotrName);
}
