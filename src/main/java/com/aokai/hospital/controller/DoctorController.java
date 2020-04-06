package com.aokai.hospital.controller;

import com.aokai.hospital.enums.ApplicationEnum;
import com.aokai.hospital.model.dto.User;
import com.aokai.hospital.model.qo.UserReq;
import com.aokai.hospital.model.vo.RecommendDoctorResp;
import com.aokai.hospital.model.vo.result.FailResult;
import com.aokai.hospital.model.vo.result.Result;
import com.aokai.hospital.model.vo.result.SuccessResult;
import com.aokai.hospital.service.DoctorService;
import com.aokai.hospital.utils.TokenUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
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
 * @date : Created in 2020/4/6 16:41
 */
@RestController
@RequestMapping(value = "/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    /**
     * 获取推荐医生信息
     * @return
     */
    @RequestMapping(value = "/getRecommendDoctor", method = RequestMethod.POST)
    @ResponseBody
    public Result getRecommendDoctor() {
        // 获取推荐医生信息
        RecommendDoctorResp recommendDoctorResp = doctorService.getRecommendDoctor();
        return new SuccessResult<>(recommendDoctorResp);
    }

}
