package com.aokai.hospital.controller;

import com.aokai.hospital.model.qo.GetDoctorReq;
import com.aokai.hospital.model.qo.GetWorkDayReq;
import com.aokai.hospital.model.qo.PageReq;
import com.aokai.hospital.model.vo.result.Result;
import com.aokai.hospital.model.vo.result.SuccessResult;
import com.aokai.hospital.po.Doctor;
import com.aokai.hospital.po.Workday;
import com.aokai.hospital.service.WorkDayService;
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
 * @date : Created in 2020/4/18 18:18
 */
@RestController
@RequestMapping(value = "/workday")
public class WorkDayController {

    @Autowired
    private WorkDayService  workDayService;


    /**
     * 医生工作日
     * @param getWorkDayReq
     * @return
     */
    @RequestMapping(value = "/getWorkDay", method = RequestMethod.POST)
    @ResponseBody
    public Result getWorkDay(@RequestBody @Validated GetWorkDayReq getWorkDayReq) {
        // 分页获取
        int pageNum = getWorkDayReq.getPageNum() == null ? 1 : getWorkDayReq.getPageNum();
        int pageSize = getWorkDayReq.getPageSize() == null ? 10 : getWorkDayReq.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        // 分页获取单个医生工作日信息
        List<Workday> workdayList = workDayService.getWorkDay(getWorkDayReq.getDoctorId());

        PageInfo<Workday> workdayPageInfo = new PageInfo<>(workdayList);

        return new SuccessResult<>(workdayPageInfo);
    }

    /**
     * 所有医生工作日
     * @param pageReq
     * @return
     */
    @RequestMapping(value = "/getAllWorkDay", method = RequestMethod.POST)
    @ResponseBody
    public Result getAllWorkDay(@RequestBody @Validated PageReq pageReq) {
        // 分页获取
        int pageNum = pageReq.getPageNum() == null ? 1 : pageReq.getPageNum();
        int pageSize = pageReq.getPageSize() == null ? 10 : pageReq.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        // 分页获取所有医生工作日信息
        List<Workday> workdayList = workDayService.getAllWorkDay();
        PageInfo<Workday> workdayPageInfo = new PageInfo<>(workdayList);

        return new SuccessResult<>(workdayPageInfo);
    }


//    /**
//     * 管理员分配医生工作日是否出诊
//     * @param pageReq
//     * @return
//     */
//    @RequestMapping(value = "/getAllWorkDay", method = RequestMethod.POST)
//    @ResponseBody
//    public Result getAllWorkDay(@RequestBody @Validated PageReq pageReq) {
//        // 管理员分配医生工作日是否出诊
//
//
//        return new SuccessResult<>();
//    }


}
