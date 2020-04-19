package com.aokai.hospital.service.Impl;

import com.aokai.hospital.dao.ApplyMapper;
import com.aokai.hospital.dao.WorkdayMapper;
import com.aokai.hospital.model.dto.ApplyInfo;
import com.aokai.hospital.po.Apply;
import com.aokai.hospital.po.Workday;
import com.aokai.hospital.service.ApplyService;
import com.aokai.hospital.utils.BeanUtil;
import com.github.pagehelper.PageInfo;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/19 18:03
 */
@Service
@Slf4j
public class ApplyServiceImpl implements ApplyService {

    @Autowired
    private ApplyMapper applyMapper;

    @Autowired
    private WorkdayMapper workdayMapper;

    @Override
    public PageInfo<ApplyInfo> getApply(Integer doctorId) {
        List<ApplyInfo> applyInfoList;
        // 获取医生申请信息
        List<Apply> applyList = applyMapper.getApply(doctorId);
        if (CollectionUtils.isEmpty(applyList)) {
            return new PageInfo<>();
        }
        PageInfo<Apply> applyPageInfo = new PageInfo<>(applyList);
        // 复制
        applyInfoList = BeanUtil.copyPropertiesByFastJson(applyPageInfo.getList(), ApplyInfo.class);
        // 遍历获取工作日信息
        for (Apply apply : applyList) {
            Workday workday = workdayMapper.selectByPrimaryKey(apply.getWorkdayId());
            if (workday == null) {
                continue;
            }
            Optional<ApplyInfo> optionalApplyInfo = applyInfoList.stream().filter(o -> o.getWorkdayId().equals(workday.getId())).findAny();
            if (optionalApplyInfo.isPresent()) {
                ApplyInfo applyInfo = optionalApplyInfo.get();
                applyInfo.setPeriod(workday.getPeriod());
                applyInfo.setWorkTime(workday.getWorkTime());
            }
        }
        PageInfo<ApplyInfo> applyInfoPageInfo = new PageInfo<>();
        BeanUtils.copyProperties(applyPageInfo, applyInfoPageInfo);
        applyInfoPageInfo.setList(applyInfoList);

        return applyInfoPageInfo;
    }
}
