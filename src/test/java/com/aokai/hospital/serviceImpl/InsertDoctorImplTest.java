package com.aokai.hospital.serviceImpl;

import com.aokai.hospital.dao.DoctorMapper;
import com.aokai.hospital.po.Doctor;
import com.aokai.hospital.service.DoctorService;
import com.aokai.hospital.utils.MD5Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.util.ApplicationContextTestUtils;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/6 16:34
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class InsertDoctorImplTest {

    @Autowired
    private DoctorMapper doctorMapper;

    @Test
    public void insertDoctor() {
        Doctor doctor = new Doctor();
        doctor.setAge((byte) 100);
        doctor.setCareer("主任医生");
        doctor.setDescription("我超牛逼");
        doctor.setFee(23);
        doctor.setName("奥巴马");
        doctor.setOfficeName("儿科神经内科");
        doctor.setPassword(MD5Util.string2MD5("123456"));
        doctor.setPicpath("");
        doctor.setSex("男");
        doctor.setUsername("888888");

        doctorMapper.insert(doctor);
    }

}
