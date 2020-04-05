package com.aokai.hospital.service;

import com.aokai.hospital.model.dto.User;
import com.aokai.hospital.model.qo.UserReq;

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
}
