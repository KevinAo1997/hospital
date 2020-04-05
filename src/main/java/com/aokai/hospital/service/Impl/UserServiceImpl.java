package com.aokai.hospital.service.Impl;

import com.aokai.hospital.dao.UserMapper;
import com.aokai.hospital.service.UserService;
import lombok.extern.slf4j.Slf4j;
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
    private UserMapper userMapper;

    @Override
    public Integer updateUserState(Integer state, Integer id) {
        return userMapper.updateUserState(state, id);
    }
}
