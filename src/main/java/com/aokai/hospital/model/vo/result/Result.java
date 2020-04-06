package com.aokai.hospital.model.vo.result;


import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/3/29 19:15
 */
@ToString
@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 3149361523750900688L;

    /**
     * true:业务执行成功， false:业务执行失败
     */
    private Boolean status;

    /**
     * 状态码
     */
    private String code;

    /**
     * 消息
     */
    private String msg;

    /**
     * 结果数据
     */
    private T data;
}
