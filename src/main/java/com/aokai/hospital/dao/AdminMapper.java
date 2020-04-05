package com.aokai.hospital.dao;

import com.aokai.hospital.model.dto.User;
import com.aokai.hospital.po.Admin;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface AdminMapper extends Mapper<Admin> {

    /**
     * 获取用户信息
     * @param username
     * @param password
     * @return
     */
    Admin checkAdmin(@Param("username") String username,@Param("password") String password);
}
