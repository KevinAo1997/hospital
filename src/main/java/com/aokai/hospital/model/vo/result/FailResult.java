package com.aokai.hospital.model.vo.result;


import com.aokai.hospital.enums.ApplicationEnum;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/3/29 19:15
 */
public class FailResult<T> extends Result<T> {

    private static final long serialVersionUID = -6073157176763840816L;

    public FailResult() {
        setStatus(false);
        setCode(ApplicationEnum.FAIL.getCode());
        setMsg(ApplicationEnum.FAIL.getMessage());
    }

    public FailResult(ApplicationEnum applicationEnum) {
        setStatus(false);
        setCode(applicationEnum.getCode());
        setMsg(applicationEnum.getMessage());
    }


    public FailResult(ApplicationEnum applicationEnum,  T data) {
        setStatus(false);
        setCode(applicationEnum.getCode());
        setMsg(applicationEnum.getMessage());
        setData(data);
    }



}
