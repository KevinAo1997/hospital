package com.aokai.hospital.exception;

import com.aokai.hospital.enums.ApplicationEnum;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/3/29 19:15
 */
public class ApplicationException extends RuntimeException {

    private static final long serialVersionUID = -1629701124990906510L;

    /**
     * 每一个抛出的异常都必须对应一个 ApplicationEnum
     */
    private ApplicationEnum applicationEnum;

    public ApplicationEnum getApplicationEnum() {
        return applicationEnum;
    }

    public ApplicationException(ApplicationEnum applicationEnum) {
        super(applicationEnum.getCode() + " : " + applicationEnum.getMessage());
        this.applicationEnum = applicationEnum;
    }

}
