package com.aokai.hospital.dao;

import com.aokai.hospital.po.Office;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface OfficeMapper extends Mapper<Office> {
}
