package com.aokai.hospital.model.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/6 17:20
 */
@Data
@ToString
public class RoomInfo implements Serializable {

    private static final long serialVersionUID = -1831961004151852235L;

    /**
     * 科室名称
     */
    private String roomName;

    /**
     * 科室介绍
     */
    private String roomDesc;

    /**
     * 医生数量
     */
    private Integer doctorNum;

}
