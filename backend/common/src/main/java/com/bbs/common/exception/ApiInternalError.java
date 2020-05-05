package com.bbs.common.exception;

/**
 * @author: guangxush
 * @create: 2020/05/05
 */
public class ApiInternalError extends RuntimeException {
    public ApiInternalError(String message, String s) {

    }

    public ApiInternalError(String message) {
        super(message);
    }

    public ApiInternalError(String message, Throwable e) {
        super(message, e);
    }
}
