package com.aokai.hospital.model.qo;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/4/8 23:33
 */
@Data
@ToString
public class PageReq implements Serializable {

    private static final long serialVersionUID = 6656600661184992882L;

    /**
     * 页码
     */
    @NotNull
    private Integer pageNum;

    /**
     * 分页数目
     */
    @NotNull
    private Integer pageSize;
}
