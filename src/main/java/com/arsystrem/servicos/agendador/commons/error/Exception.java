package com.arsystrem.servicos.agendador.commons.error;

import lombok.Getter;

@Getter
public class Exception extends RuntimeException {
    private static final long serialVersionUID = 1L;

    protected ErrorType errorType;
    protected short errorCode;

    protected Exception(ErrorType errorType, String error) {
        super(error);
        this.errorType = errorType;
        this.errorCode = errorType.getCode();
    }

    protected Exception(ErrorType errorType, short errorCode, String error) {
        super(error);
        this.errorType = errorType;
        this.errorCode = errorCode;
    }

    protected Exception(ErrorType errorType, short errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorType = errorType;
        this.errorCode = errorCode;
    }

    public void setErrorType(ErrorType errorType) {
        this.errorType = errorType;
    }

    public void setErrorCode(short errorCode) {
        this.errorCode = errorCode;
    }

    public static Exception of(ErrorType errorType, String message) {
        return new Exception(errorType, message);
    }

    public static Exception of(ErrorType errorType, short errorCode, String message) {
        return new Exception(errorType, errorCode, message);
    }

    public static Exception of(String message, Throwable cause) {
        return new Exception(ErrorType.Exception, Short.MIN_VALUE, message, cause);
    }

    public static Exception ofValidation(String message) {
        return new Exception(ErrorType.Validation, message);
    }

    public static Exception ofUnauthorized(String message) {
        return new Exception(ErrorType.Unauthorized, message);
    }

    public static Exception ofNotFound(String message) {
        return new Exception(ErrorType.NotFound, message);
    }

    public static Exception ofConflict(String message) {
        return new Exception(ErrorType.Conflict, message);
    }

    public static Exception ofException(String message) {
        return new Exception(ErrorType.Exception, message);
    }

}
