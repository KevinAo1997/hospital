package com.aokai.hospital.model.qo;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/6 17:43
 */
@Data
@ToString
public class RoomDetailReq implements Serializable {

    private static final long serialVersionUID = -2836498953989730065L;

    /**
     * 科室名称
     */
    @NotBlank
    private String roomName;
}
