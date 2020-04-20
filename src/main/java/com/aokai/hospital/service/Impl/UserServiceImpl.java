package com.aokai.hospital.service.Impl;

import com.aokai.hospital.dao.AdminMapper;
import com.aokai.hospital.dao.DoctorMapper;
import com.aokai.hospital.dao.PatientMapper;
import com.aokai.hospital.enums.UserTypeEnum;
import com.aokai.hospital.enums.UserTypeEnum.UserType;
import com.aokai.hospital.model.dto.User;
import com.aokai.hospital.model.qo.RegisterReq;
import com.aokai.hospital.model.qo.UserReq;
import com.aokai.hospital.po.Admin;
import com.aokai.hospital.po.Doctor;
import com.aokai.hospital.po.Patient;
import com.aokai.hospital.service.UserService;
import com.aokai.hospital.utils.MD5Util;
import com.github.pagehelper.PageInfo;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private PatientMapper patientMapper;

    @Autowired
    private DoctorMapper doctorMapper;

    public UserServiceImpl() {
    }

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
                return null;
            }
            BeanUtils.copyProperties(admin, user);
            // 患者
        } else if (UserType.PATIENT.equals(userType)) {
            Patient patient = patientMapper.checkPatient(username, password);
            if (patient == null) {
                return null;
            }
            BeanUtils.copyProperties(patient, user);
            // 医生
        } else {
            Doctor doctor = doctorMapper.checkDoctor(username, password);
            if (doctor == null) {
                return null;
            }
            BeanUtils.copyProperties(doctor, user);
        }
        return user;
    }

    @Override
    public Boolean checkUserName(RegisterReq registerReq) {
        String username = registerReq.getUsername();
        // 根据用户账号查询用户信息
        List<Patient> patientList = patientMapper.checkUserName(username);
        if (CollectionUtils.isEmpty(patientList)) {
            return false;
        }
        return true;
    }

    @Override
    public Boolean checkUserEmail(RegisterReq registerReq) {
        String email = registerReq.getEmail();
        // 根据用户邮箱查询用户信息
        List<Patient> patientList = patientMapper.checkUserEmail(email);
        if (CollectionUtils.isEmpty(patientList)) {
            return false;
        }
        return true;
    }

    @Override
    public Boolean insertPatient(RegisterReq registerReq) {
        Patient patient = new Patient();
        patient.setUsername(registerReq.getUsername());
        patient.setPassword(MD5Util.string2MD5(registerReq.getPassword()));
        patient.setEmail(registerReq.getEmail());
        patient.setName(registerReq.getName());
        // 增加患者用户
        Integer count = patientMapper.insert(patient);
        if (count > 0) {
            return true;
        }
        return false;
    }

    @Override
    public PageInfo<Patient> getPatientList() {
        // 获取推荐患者信息
        return null;
    }
}
