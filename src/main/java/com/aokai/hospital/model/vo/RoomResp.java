package com.aokai.hospital.model.vo;

import com.aokai.hospital.model.dto.RoomInfo;
import java.io.Serializable;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/6 17:30
 */
@Data
@ToString
public class RoomResp implements Serializable {

    private static final long serialVersionUID = -6346225988078823031L;

    /**
     * 科室信息
     */
    private List<RoomInfo> roomInfoList;
}
