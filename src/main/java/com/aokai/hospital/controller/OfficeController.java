package com.aokai.hospital.controller;

import com.aokai.hospital.enums.ApplicationEnum;
import com.aokai.hospital.model.dto.DoctorInfo;
import com.aokai.hospital.model.dto.OfficeInfo;
import com.aokai.hospital.model.qo.InsertOfficeReq;
import com.aokai.hospital.model.qo.OfficeDetailReq;
import com.aokai.hospital.model.qo.PageReq;
import com.aokai.hospital.model.qo.SearchOfficeReq;
import com.aokai.hospital.model.vo.OfficeDetailResp;
import com.aokai.hospital.model.vo.OfficeResp;
import com.aokai.hospital.model.vo.result.FailResult;
import com.aokai.hospital.model.vo.result.Result;
import com.aokai.hospital.model.vo.result.SuccessResult;
import com.aokai.hospital.po.Office;
import com.aokai.hospital.service.OfficeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
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

    /**
     * 搜索科室
     * @return
     */
    @RequestMapping(value = "/searchOffice", method = RequestMethod.POST)
    @ResponseBody
    public Result searchOffice(@RequestBody @Validated SearchOfficeReq searchOfficeReq) {
        // 分页获取
        int pageNum = searchOfficeReq.getPageNum() == null ? 1 : searchOfficeReq.getPageNum();
        int pageSize = searchOfficeReq.getPageSize() == null ? 10 : searchOfficeReq.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        // 获取科室列表
        List<Office> officeList = officeService.searchOffice(searchOfficeReq);
        PageInfo<Office> officeInfoPageInfo = new PageInfo<>(officeList);

        return new SuccessResult<>(officeInfoPageInfo);
    }

    /**
     * 新增科室
     * @return
     */
    @RequestMapping(value = "/insertOffice", method = RequestMethod.POST)
    @ResponseBody
    public Result insertOffice(@RequestBody @Validated InsertOfficeReq insertOfficeReq) {
        // 检查科室名称是否存在
        Boolean checkOffcieName = officeService.checkOffcieName(insertOfficeReq.getOfficeName());
        if (checkOffcieName) {
            return new FailResult<>(ApplicationEnum.OFFICE_NAME_REPETITION);
        }
        // 新增科室
        Boolean insertOffice = officeService.insertOffice(insertOfficeReq);
        if (insertOffice) {
            return new SuccessResult<>();
        }
        return new FailResult<>();
    }


}
