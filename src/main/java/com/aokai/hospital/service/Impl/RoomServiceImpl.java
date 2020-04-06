package com.aokai.hospital.service.Impl;

import com.aokai.hospital.dao.DoctorMapper;
import com.aokai.hospital.dao.RoomMapper;
import com.aokai.hospital.model.dto.DoctorInfo;
import com.aokai.hospital.model.dto.RoomInfo;
import com.aokai.hospital.model.qo.RoomDetailReq;
import com.aokai.hospital.model.vo.RoomDetailResp;
import com.aokai.hospital.model.vo.RoomResp;
import com.aokai.hospital.po.Doctor;
import com.aokai.hospital.po.Room;
import com.aokai.hospital.service.RoomService;
import java.util.LinkedList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/6 17:19
 */
@Slf4j
@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomMapper roomMapper;

    @Autowired
    private DoctorMapper doctorMapper;


    @Override
    public RoomResp getRoomList() {
        RoomResp roomResp = new RoomResp();
        List<RoomInfo> roomInfoList = new LinkedList<>();
        // 获取科室信息
        List<Room> roomList = roomMapper.selectAll();
        if (CollectionUtils.isEmpty(roomList)) {
            return null;
        }
        // 遍历
        for (Room room : roomList) {
            RoomInfo roomInfo = new RoomInfo();
            roomInfo.setRoomName(room.getOfficename());
            roomInfo.setDoctorNum(room.getDoctornum());
            roomInfo.setRoomDesc(room.getRoomname());

            roomInfoList.add(roomInfo);
        }
        roomResp.setRoomInfoList(roomInfoList);
        return roomResp;
    }

    @Override
    public RoomDetailResp getRoomDetailList(RoomDetailReq roomDetailReq) {
        RoomDetailResp roomDetailResp = new RoomDetailResp();
        List<DoctorInfo> doctorInfoList = new LinkedList<>();
        String roomName = roomDetailReq.getRoomName();
        // 根据科室名称获取医生信息
        List<Doctor> doctorList = doctorMapper.getDoctorByRoomName(roomName);
        if (CollectionUtils.isEmpty(doctorList)) {
            return null;
        }
        // 遍历
        for (Doctor doctor : doctorList) {
            DoctorInfo doctorInfo = new DoctorInfo();
            doctorInfo.setDoctorCareer(doctor.getCareer());
            doctorInfo.setDoctorName(doctor.getDname());
            doctorInfo.setDoctorOffice(doctor.getRoom());
            doctorInfo.setDoctorDesc(doctor.getDescription());
            doctorInfo.setPicPath(doctor.getPicpath());

            doctorInfoList.add(doctorInfo);
        }
        roomDetailResp.setDoctorInfoList(doctorInfoList);
        return roomDetailResp;
    }
}
