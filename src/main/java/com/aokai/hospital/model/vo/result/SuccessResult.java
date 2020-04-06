package com.aokai.hospital.model.vo.result;


import com.aokai.hospital.enums.ApplicationEnum;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/3/29 19:15
 */
public class SuccessResult<T> extends Result<T> {

    private static final long serialVersionUID = 3388694251281043597L;

    public SuccessResult() {
        setStatus(true);
        setCode(ApplicationEnum.SUCCESS.getCode());
        setMsg(ApplicationEnum.SUCCESS.getMessage());
    }

    public SuccessResult(T data) {
        setStatus(true);
        setCode(ApplicationEnum.SUCCESS.getCode());
        setMsg(ApplicationEnum.SUCCESS.getMessage());
        setData(data);
    }

}
