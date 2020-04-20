package com.aokai.hospital.controller;

import com.aokai.hospital.enums.ApplicationEnum;
import com.aokai.hospital.model.dto.DoctorInfo;
import com.aokai.hospital.model.qo.GetDoctorReq;
import com.aokai.hospital.model.qo.InsertDoctorReq;
import com.aokai.hospital.model.qo.PageReq;
import com.aokai.hospital.model.qo.SearchDoctorNameReq;
import com.aokai.hospital.model.vo.RecommendDoctorResp;
import com.aokai.hospital.model.vo.result.FailResult;
import com.aokai.hospital.model.vo.result.Result;
import com.aokai.hospital.model.vo.result.SuccessResult;
import com.aokai.hospital.po.Doctor;
import com.aokai.hospital.service.DoctorService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public Result getRecommendDoctor(@RequestBody @Validated PageReq pageReq) {
        // 分页获取
        int pageNum = pageReq.getPageNum() == null ? 1 : pageReq.getPageNum();
        int pageSize = pageReq.getPageSize() == null ? 10 : pageReq.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        // 获取推荐医生信息
        PageInfo<DoctorInfo> doctorInfoPageInfo = doctorService.getRecommendDoctor();

        return new SuccessResult<>(doctorInfoPageInfo);
    }

    /**
     * 搜索医生
     * @param searchDoctorNameReq
     * @return
     */
    @RequestMapping(value = "/searchDoctor", method = RequestMethod.POST)
    @ResponseBody
    public Result searchDoctor(@RequestBody @Validated SearchDoctorNameReq searchDoctorNameReq) {
        // 分页获取
        int pageNum = searchDoctorNameReq.getPageNum() == null ? 1 : searchDoctorNameReq.getPageNum();
        int pageSize = searchDoctorNameReq.getPageSize() == null ? 10 : searchDoctorNameReq.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        // 搜索医生信息
        List<Doctor> doctorList = doctorService.searchDoctor(searchDoctorNameReq);
        PageInfo<Doctor> doctorPageInfo = new PageInfo<>(doctorList);
        return new SuccessResult<>(doctorPageInfo);
    }

    /**
     * 获取医生信息
     * @param getDoctorReq
     * @return
     */
    @RequestMapping(value = "/getDoctor", method = RequestMethod.POST)
    @ResponseBody
    public Result getDoctor(@RequestBody @Validated GetDoctorReq getDoctorReq) {
        // 获取医生信息
        Doctor doctor = doctorService.getDoctor(getDoctorReq.getDoctorId());

        return new SuccessResult<>(doctor);
    }

    /**
     * 新增医生
     * @param insertDoctorReq
     * @return
     */
    @RequestMapping(value = "/insertDoctor", method = RequestMethod.POST)
    @ResponseBody
    public Result insertDoctor(@RequestBody @Validated InsertDoctorReq insertDoctorReq) {
        // 判断账号是否存在
        Boolean checkName = doctorService.checkName(insertDoctorReq.getUsername());
        if (checkName) {
            return new FailResult<>(ApplicationEnum.USER_NAME_REPETITION);
        }
        // 新增医生
        Boolean insertDoctor = doctorService.insertDoctor(insertDoctorReq);
        if (insertDoctor) {
            return new SuccessResult<>();
        }
        return new FailResult<>();
    }




}
