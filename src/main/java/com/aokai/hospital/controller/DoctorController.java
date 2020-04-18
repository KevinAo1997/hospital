package com.aokai.hospital.controller;

import com.aokai.hospital.model.qo.GetDoctorReq;
import com.aokai.hospital.model.qo.SearchDoctorNameReq;
import com.aokai.hospital.model.vo.RecommendDoctorResp;
import com.aokai.hospital.model.vo.result.Result;
import com.aokai.hospital.model.vo.result.SuccessResult;
import com.aokai.hospital.po.Doctor;
import com.aokai.hospital.service.DoctorService;
import java.util.List;
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

    @RequestMapping(value = "/searchDoctor", method = RequestMethod.POST)
    @ResponseBody
    public Result searchDoctor(@RequestBody @Validated SearchDoctorNameReq searchDoctorNameReq) {
        // 获取推荐医生信息
        List<Doctor> doctor = doctorService.searchDoctor(searchDoctorNameReq);

        return new SuccessResult<>(doctor);
    }

    @RequestMapping(value = "/getDoctor", method = RequestMethod.POST)
    @ResponseBody
    public Result getDoctor(@RequestBody @Validated GetDoctorReq getDoctorReq) {
        // 获取推荐医生信息
        Doctor doctor = doctorService.getDoctor(getDoctorReq.getDoctorId());

        return new SuccessResult<>(doctor);
    }




}
