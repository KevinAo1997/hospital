package com.aokai.hospital.controller;

import com.aokai.hospital.model.dto.DoctorInfo;
import com.aokai.hospital.model.dto.OfficeInfo;
import com.aokai.hospital.model.qo.OfficeDetailReq;
import com.aokai.hospital.model.qo.PageReq;
import com.aokai.hospital.model.vo.OfficeDetailResp;
import com.aokai.hospital.model.vo.OfficeResp;
import com.aokai.hospital.model.vo.result.Result;
import com.aokai.hospital.model.vo.result.SuccessResult;
import com.aokai.hospital.service.OfficeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public Result getOfficeList(@RequestBody @Validated PageReq pageReq) {
        // 分页获取
        int pageNum = pageReq.getPageNum() == null ? 1 : pageReq.getPageNum();
        int pageSize = pageReq.getPageSize() == null ? 10 : pageReq.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        // 获取科室列表
        PageInfo<OfficeInfo> officeInfoPageInfo = officeService.getOfficeList();

        return new SuccessResult<>(officeInfoPageInfo);
    }

    /**
     * 获取科室详情列表
     * @return
     */
    @RequestMapping(value = "/getOfficeDetailList", method = RequestMethod.POST)
    @ResponseBody
    public Result getOfficeDetailList(@RequestBody @Validated OfficeDetailReq officeDetailReq) {
        // 分页获取
        int pageNum = officeDetailReq.getPageNum() == null ? 1 : officeDetailReq.getPageNum();
        int pageSize = officeDetailReq.getPageSize() == null ? 10 : officeDetailReq.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        // 获取医生信息
        PageInfo<DoctorInfo> doctorInfoPageInfo = officeService.getOfficeDetailList(officeDetailReq);

        return new SuccessResult<>(doctorInfoPageInfo);
    }


}
