package com.aokai.hospital.dao;

import com.aokai.hospital.po.Room;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface RoomMapper extends Mapper<Room> {

}
