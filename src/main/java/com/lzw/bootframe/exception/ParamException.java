package com.lzw.bootframe.exception;

import lombok.Data;

@Data
public class ParamException extends  RuntimeException {


    private String msg;
    private int code = 500;

    public ParamException() {
        super();

    }

    public ParamException(String message) {
        super(message);
        this.msg = message;
    }

    public ParamException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParamException(Throwable cause) {
        super(cause);
    }

    protected ParamException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
