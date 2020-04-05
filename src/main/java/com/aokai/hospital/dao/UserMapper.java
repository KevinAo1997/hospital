package com.aokai.hospital.dao;

import com.aokai.hospital.po.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMapper extends Mapper<User> {

    Integer updateUserState(@Param("state")Integer state, @Param("id")Integer id);
}
