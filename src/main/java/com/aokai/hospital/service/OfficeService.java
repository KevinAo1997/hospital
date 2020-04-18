package com.aokai.hospital.service;

import com.aokai.hospital.model.qo.OfficeDetailReq;
import com.aokai.hospital.model.vo.OfficeDetailResp;
import com.aokai.hospital.model.vo.OfficeResp;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/6 17:19
 */
public interface OfficeService {

    /**
     * 获取科室列表
     * @return
     */
    OfficeResp getOfficeList();

    /**
     * 获取科室详情列表
     * @param officeDetailReq
     * @return
     */
    OfficeDetailResp getOfficeDetailList(OfficeDetailReq officeDetailReq);
}
