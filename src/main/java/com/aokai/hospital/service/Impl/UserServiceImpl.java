package com.aokai.hospital.service.Impl;

import com.aokai.hospital.dao.AdminMapper;
import com.aokai.hospital.dao.DoctorMapper;
import com.aokai.hospital.dao.PatientMapper;
import com.aokai.hospital.enums.UserTypeEnum;
import com.aokai.hospital.enums.UserTypeEnum.UserType;
import com.aokai.hospital.model.dto.User;
import com.aokai.hospital.model.qo.UserReq;
import com.aokai.hospital.po.Admin;
import com.aokai.hospital.po.Doctor;
import com.aokai.hospital.po.Patient;
import com.aokai.hospital.service.UserService;
import com.aokai.hospital.utils.MD5Util;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/3/29 19:23
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private AdminMapper adminMapper;

    private PatientMapper patientMapper;

    private DoctorMapper doctorMapper;

    @Override
    public User checkUser(UserReq userReq) {
        User user = new User();
        UserTypeEnum.UserType userType = userReq.getUserType();
        String username = userReq.getUsername();
        String password = MD5Util.string2MD5(userReq.getPassword());

        // 根据用户类型去查询用户信息
        // 管理员
        if (UserType.ADMIN.equals(userType)) {
            Admin admin = adminMapper.checkAdmin(username, password);
            if (admin == null) {
                return user;
            }
            user.setUsername(admin.getName());
            user.setPassword(admin.getPassword());
            // 患者
        } else if (UserType.PATIENT.equals(userType)) {
            Patient patient = patientMapper.checkPatient(username, password);
            if (patient == null) {
                return user;
            }
            user.setUsername(patient.getAccount());
            user.setPassword(patient.getPassword());
            // 医生
        } else {
            Doctor doctor = doctorMapper.checkDoctor(username, password);
            if (doctor == null) {
                return user;
            }
            user.setUsername(doctor.getAccount());
            user.setPassword(doctor.getPassword());
        }
        return user;
    }
}
