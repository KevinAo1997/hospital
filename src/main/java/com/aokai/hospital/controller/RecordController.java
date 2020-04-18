package com.aokai.hospital.controller;

import com.aokai.hospital.model.dto.PatientRecordInfo;
import com.aokai.hospital.model.qo.GetRecordListReq;
import com.aokai.hospital.model.qo.GetWorkDayReq;
import com.aokai.hospital.model.qo.InsertRecordReq;
import com.aokai.hospital.model.qo.PageReq;
import com.aokai.hospital.model.vo.result.FailResult;
import com.aokai.hospital.model.vo.result.Result;
import com.aokai.hospital.model.vo.result.SuccessResult;
import com.aokai.hospital.po.Workday;
import com.aokai.hospital.service.RecordService;
import com.github.pagehelper.Page;
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
 * @date : Created in 2020/4/18 18:31
 */
@RestController
@RequestMapping(value = "/record")
public class RecordController {

    @Autowired
    private RecordService recordServicec;

    /**
     * 患者新增预约记录
     * @param insertRecordReq
     * @return
     */
    @RequestMapping(value = "/insertRecord", method = RequestMethod.POST)
    @ResponseBody
    public Result insertRecord(@RequestBody @Validated InsertRecordReq insertRecordReq) {
        // 患者新增一条预约记录
        Boolean insertRecord = recordServicec.insertRecord(insertRecordReq);
        if(insertRecord) {
            return new SuccessResult<>();
        }
        return new FailResult<>();
    }

    @RequestMapping(value = "/getRecordList", method = RequestMethod.POST)
    @ResponseBody
    public Result getRecordList(@RequestBody @Validated GetRecordListReq getRecordListReq) {
        // 分页获取
        int pageNum = getRecordListReq.getPageNum() == null ? 1 : getRecordListReq.getPageNum();
        int pageSize = getRecordListReq.getPageSize() == null ? 10 : getRecordListReq.getPageSize();
        PageHelper.startPage(pageNum, pageSize);

        // 分页获取患者预约记录
        PageInfo<PatientRecordInfo> patientRecordInfoPageInfo = recordServicec.getRecordList(getRecordListReq);
        return new SuccessResult<>(patientRecordInfoPageInfo);
    }

}
