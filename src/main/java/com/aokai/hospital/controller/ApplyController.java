package com.aokai.hospital.controller;

import com.aokai.hospital.model.dto.ApplyInfo;
import com.aokai.hospital.model.qo.DeleteApplyReq;
import com.aokai.hospital.model.qo.GetApplyReq;
import com.aokai.hospital.model.qo.InsertApplyReq;
import com.aokai.hospital.model.vo.result.FailResult;
import com.aokai.hospital.model.vo.result.Result;
import com.aokai.hospital.model.vo.result.SuccessResult;
import com.aokai.hospital.service.ApplyService;
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
 * @date : Created in 2020/4/19 18:01
 */
@RestController
@RequestMapping(value = "/apply")
public class ApplyController {

    @Autowired
    private ApplyService applyService;


    /**
     * 分页获取推荐医生排版申请信息
     * @param getApplyReq
     * @return
     */
    @RequestMapping(value = "/getApply", method = RequestMethod.POST)
    @ResponseBody
    public Result getApply(@RequestBody @Validated GetApplyReq getApplyReq) {
        // 分页获取
        int pageNum = getApplyReq.getPageNum() == null ? 1 : getApplyReq.getPageNum();
        int pageSize = getApplyReq.getPageSize() == null ? 10 : getApplyReq.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        // 分页获取推荐医生排版申请信息
        PageInfo<ApplyInfo> applyInfoPageInfo = applyService.getApply(getApplyReq.getDoctorId());

        return new SuccessResult<>(applyInfoPageInfo);
    }

    /**
     * 申请工作日
     * @param insertApplyReq
     * @return
     */
    @RequestMapping(value = "/insertApply", method = RequestMethod.POST)
    @ResponseBody
    public Result insertApply(@RequestBody @Validated InsertApplyReq insertApplyReq) {
        // 申请工作日
        Boolean insertAppy = applyService.insertApply(insertApplyReq);
        if (insertAppy) {
            return new SuccessResult<>();
        }
        return new FailResult<>();
    }

    /**
     * 取消申请工作日
     * @param deleteApplyReq
     * @return
     */
    @RequestMapping(value = "/deleteApply", method = RequestMethod.POST)
    @ResponseBody
    public Result deleteApply(@RequestBody @Validated DeleteApplyReq deleteApplyReq) {
        // 取消申请工作日
        Boolean deleteApply = applyService.deleteApply(deleteApplyReq);
        if (deleteApply) {
            return new SuccessResult<>();
        }
        return new FailResult<>();
    }




}
