package com.aokai.hospital.serviceImpl;

import com.aokai.hospital.dao.DoctorMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.util.ApplicationContextTestUtils;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/6 16:34
 */
public class InsertDoctorImplTest extends ApplicationContextTestUtils {

    @Autowired
    private DoctorMapper doctorMapper;

    @Test
    public void insertDoctor() {
    }

}
