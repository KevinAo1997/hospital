package com.aokai.hospital.service;

import com.aokai.hospital.model.qo.RoomDetailReq;
import com.aokai.hospital.model.vo.RoomDetailResp;
import com.aokai.hospital.model.vo.RoomResp;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/6 17:19
 */
public interface RoomService {

    /**
     * 获取科室列表
     * @return
     */
    RoomResp getRoomList();

    /**
     * 获取科室详情列表
     * @param roomDetailReq
     * @return
     */
    RoomDetailResp getRoomDetailList(RoomDetailReq roomDetailReq);
}
