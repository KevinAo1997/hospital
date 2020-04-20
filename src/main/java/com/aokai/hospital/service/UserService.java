package com.aokai.hospital.service;

import com.aokai.hospital.model.dto.User;
import com.aokai.hospital.model.qo.RegisterReq;
import com.aokai.hospital.model.qo.UpdatePasswordReq;
import com.aokai.hospital.model.qo.UserReq;
import com.aokai.hospital.po.Patient;
import com.github.pagehelper.PageInfo;
import java.util.List;
import org.apache.poi.ss.formula.functions.T;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/3/29 19:19
 */
public interface UserService {

    /**
     * 获取用户信息
     * @param userReq
     * @return
     */
    User checkUser(UserReq userReq);

    /**
     * 跟据用户名账号获取用户是否存在
     * @param registerReq
     * @return
     */
    Boolean checkUserName(RegisterReq registerReq);

    /**
     * 根据邮箱号获取用户是否存在
     * @param registerReq
     * @return
     */
    Boolean checkUserEmail(RegisterReq registerReq);

    /**
     * 注册患者信息
     * @param registerReq
     */
    Boolean insertPatient(RegisterReq registerReq);

    /**
     * 获取推荐患者信息
     * @return
     */
    List<Patient> getPatientList();

    /**
     * 修改密码
     * @param updatePasswordReq
     * @return
     */
    Boolean updatePassword(UpdatePasswordReq updatePasswordReq);
}
