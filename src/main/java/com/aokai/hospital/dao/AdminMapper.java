package com.aokai.hospital.dao;

import com.aokai.hospital.po.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface AdminMapper extends Mapper<Admin> {

    /**
     * 获取用户
     * @param username
     * @param password
     * @return
     */
    Admin checkAdmin(@Param("username") String username, @Param("password") String password);
}
