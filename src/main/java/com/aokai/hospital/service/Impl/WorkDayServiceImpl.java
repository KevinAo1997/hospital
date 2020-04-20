package com.aokai.hospital.service.Impl;

import com.aokai.hospital.dao.WorkdayMapper;
import com.aokai.hospital.model.qo.UpdateWorkdayReq;
import com.aokai.hospital.po.Workday;
import com.aokai.hospital.service.WorkDayService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/18 18:19
 */
@Service
@Slf4j
public class WorkDayServiceImpl implements WorkDayService {

    @Autowired
    private WorkdayMapper workdayMapper;

    @Override
    public List<Workday> getWorkDay(Integer doctorId) {
        // 获取医生工作日信息
        List<Workday> workdayList = workdayMapper.getWorkDay(doctorId);
        return workdayList;
    }

    @Override
    public List<Workday> getAllWorkDay() {
        // 分页获取所有医生工作日信息
        List<Workday> workdayList = workdayMapper.selectAll();
        return workdayList;
    }

    @Override
    public Boolean updateWorkday(UpdateWorkdayReq updateWorkdayReq) {
        // 管理员分配医生工作日是否出诊
        Workday workday = new Workday();
        workday.setId(updateWorkdayReq.getWorkdayId());
        workday.setStatus(updateWorkdayReq.getStatus());

        Integer update = workdayMapper.updateByPrimaryKeySelective(workday);
        return update > 0;
    }
}
