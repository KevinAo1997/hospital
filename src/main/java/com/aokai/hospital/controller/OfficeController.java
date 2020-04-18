package com.aokai.hospital.controller;

import com.aokai.hospital.model.qo.OfficeDetailReq;
import com.aokai.hospital.model.vo.OfficeDetailResp;
import com.aokai.hospital.model.vo.OfficeResp;
import com.aokai.hospital.model.vo.result.Result;
import com.aokai.hospital.model.vo.result.SuccessResult;
import com.aokai.hospital.service.OfficeService;
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
@RequestMapping(value = "/office")
public class OfficeController {

    @Autowired
    private OfficeService officeService;

    /**
     * 获取科室列表
     * @return
     */
    @RequestMapping(value = "/getOfficeList", method = RequestMethod.POST)
    @ResponseBody
    public Result getOfficeList() {
        // 获取推荐医生信息
        OfficeResp officeResp = officeService.getOfficeList();
        return new SuccessResult<>(officeResp);
    }

    /**
     * 获取科室详情列表
     * @return
     */
    @RequestMapping(value = "/getOfficeDetailList", method = RequestMethod.POST)
    @ResponseBody
    public Result getOfficeDetailList(@RequestBody @Validated OfficeDetailReq officeDetailReq) {
        // 获取推荐医生信息
        OfficeDetailResp officeDetailResp = officeService.getOfficeDetailList(officeDetailReq);
        return new SuccessResult<>(officeDetailResp);
    }


}
