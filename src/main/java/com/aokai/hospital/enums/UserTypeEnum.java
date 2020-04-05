package com.aokai.hospital.enums;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Description :   用户类型枚举
 *
 * @author : aokai
 * @date : Created in 2020/4/5 20:36
 */
public class UserTypeEnum {

    /**
     * 用户类型枚举
     */
    @Getter
    @AllArgsConstructor
    public enum UserType {
        ADMIN("管理员"),
        PATIENT("患者"),
        DOCTOR("医生"),

        ;

        String desc;

        public Serializable getValue() {
            return name();
        }
    }

}
