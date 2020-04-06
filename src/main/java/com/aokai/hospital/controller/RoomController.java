package com.aokai.hospital.controller;

import com.aokai.hospital.model.qo.RoomDetailReq;
import com.aokai.hospital.model.vo.RecommendDoctorResp;
import com.aokai.hospital.model.vo.RoomDetailResp;
import com.aokai.hospital.model.vo.RoomResp;
import com.aokai.hospital.model.vo.result.Result;
import com.aokai.hospital.model.vo.result.SuccessResult;
import com.aokai.hospital.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/6 17:17
 */
@RestController
@RequestMapping(value = "/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    /**
     * 获取科室列表
     * @return
     */
    @RequestMapping(value = "/getRoomList", method = RequestMethod.POST)
    @ResponseBody
    public Result getRoomList() {
        // 获取推荐医生信息
        RoomResp roomResp = roomService.getRoomList();
        return new SuccessResult<>(roomResp);
    }

    /**
     * 获取科室详情列表
     * @return
     */
    @RequestMapping(value = "/getRoomDetailList", method = RequestMethod.POST)
    @ResponseBody
    public Result getRoomDetailList(@RequestBody @Validated RoomDetailReq roomDetailReq) {
        // 获取推荐医生信息
        RoomDetailResp roomDetailResp = roomService.getRoomDetailList(roomDetailReq);
        return new SuccessResult<>(roomDetailResp);
    }


}
