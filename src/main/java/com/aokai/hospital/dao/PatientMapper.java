package com.aokai.hospital.dao;

import com.aokai.hospital.po.Patient;
import java.util.List;
import javax.swing.Painter;
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

    /**
     * 根据用户账号查询用户信息
     * @param account
     * @return
     */
    List<Patient> checkUserName(@Param("account") String account);

    /**
     * 根据用户邮箱查询用户信息
     * @param email
     * @return
     */
    List<Patient> checkUserEmail(@Param("email") String email);
}
