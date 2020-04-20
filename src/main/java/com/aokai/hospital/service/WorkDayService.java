package com.aokai.hospital.service;

import com.aokai.hospital.model.qo.UpdateWorkdayReq;
import com.aokai.hospital.po.Workday;
import java.util.List;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/18 18:19
 */
public interface WorkDayService {

    /**
     * 分页获取医生工作日信息
     * @param doctorId
     * @return
     */
    List<Workday> getWorkDay(Integer doctorId);

    /**
     * 分页获取所有医生工作日信息
     * @return
     */
    List<Workday> getAllWorkDay();

    /**
     * 管理员分配医生工作日是否出诊
     * @param updateWorkdayReq
     * @return
     */
    Boolean updateWorkday(UpdateWorkdayReq updateWorkdayReq);
}
