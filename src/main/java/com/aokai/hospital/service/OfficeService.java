package com.aokai.hospital.service;

import com.aokai.hospital.model.dto.DoctorInfo;
import com.aokai.hospital.model.dto.OfficeInfo;
import com.aokai.hospital.model.qo.OfficeDetailReq;
import com.aokai.hospital.model.qo.SearchOfficeReq;
import com.aokai.hospital.po.Office;
import com.github.pagehelper.PageInfo;
import java.util.List;

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
    PageInfo<OfficeInfo> getOfficeList();

    /**
     * 获取科室详情列表
     * @param officeDetailReq
     * @return
     */
    PageInfo<DoctorInfo> getOfficeDetailList(OfficeDetailReq officeDetailReq);

    /**
     * 搜索科室
     * @param searchOfficeReq
     * @return
     */
    List<Office> searchOffice(SearchOfficeReq searchOfficeReq);
}
