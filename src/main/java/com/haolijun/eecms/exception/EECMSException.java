package com.haolijun.eecms.exception;

import lombok.Data;

/**
 * @author hljstart
 * @version 1.0.0
 * @ClassName OAException.java
 * @Description 全局异常类
 */
@Data
public class EECMSException extends RuntimeException{

    private String msg;
    private int code = 500;

    public EECMSException(String msg){
        super(msg);
        this.msg = msg;
    }

    public EECMSException(String msg, Throwable e){
        super(msg,e);
        this.msg = msg;
    }
    public EECMSException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public EECMSException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }
}
