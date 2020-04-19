package com.aokai.hospital.dao;

import com.aokai.hospital.po.Office;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface OfficeMapper extends Mapper<Office> {

    /**
     * 搜索科室
     * @param officeName
     * @return
     */
    List<Office> searchOffice(@Param("officeName") String officeName);
}
