package com.aokai.hospital.service;

import com.aokai.hospital.model.dto.ApplyInfo;
import com.aokai.hospital.model.qo.DeleteApplyReq;
import com.aokai.hospital.model.qo.InsertApplyReq;
import com.github.pagehelper.PageInfo;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/19 18:02
 */
public interface ApplyService {

    /**
     * 分页获取推荐医生排版申请信息
     * @param doctorId
     * @return
     */
    PageInfo<ApplyInfo> getApply(Integer doctorId);

    /**
     * 申请工作日
     * @param insertApplyReq
     * @return
     */
    Boolean insertApply(InsertApplyReq insertApplyReq);

    /**
     * 取消申请工作日
     * @param deleteApplyReq
     * @return
     */
    Boolean deleteApply(DeleteApplyReq deleteApplyReq);
}
