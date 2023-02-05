package com.arsystrem.servicos.agendador.commons.api;


import com.arsystrem.servicos.agendador.commons.error.ErrorType;
import com.arsystrem.servicos.agendador.commons.error.Exception;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiReturn<T> {
    private boolean success;
    private ErrorType errorType;
    private short errorCode;
    private String error;
    private String internalException;


    @JsonProperty("return")
    private T result;


    ApiReturn(T result) {
        this.success = true;
        this.result = result;
    }

    ApiReturn(String errorMessage) {
        this.error = errorMessage;
    }

    ApiReturn(ErrorType errorType, String errorMessage) {
        this.errorType = errorType;
        this.error = errorMessage;
    }

    ApiReturn(ErrorType errorType, short errorCode, String errorMessage) {
        this.errorType = errorType;
        this.errorCode = errorCode;
        this.error = errorMessage;
    }

    ApiReturn(ErrorType errorType, short errorCode, String errorMessage, Throwable internalException) {
        this(errorType, errorCode, errorMessage);
        if (internalException != null) {
            this.internalException = internalException.getMessage();
        }
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(final boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(final String error) {
        this.error = error;
    }

    public T getResult() {
        return result;
    }

    public void setResult(final T result) {
        this.result = result;
    }

    public ErrorType getErrorType() {
        return errorType;
    }

    public void setErrorType(ErrorType errorType) {
        this.errorType = errorType;
    }

    public String getInternalException() {
        return internalException;
    }

    public void setInternalException(String internalException) {
        this.internalException = internalException;
    }

    public short getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(short errorCode) {
        this.errorCode = errorCode;
    }


    public static <T> ApiReturn<T> of(T t) {
        return new ApiReturn<T>(t);
    }

    public static ApiReturn<String> of(ErrorType errorType, short errorCode, String errorMessage, Throwable internalException) {
        return new ApiReturn<String>(errorType, errorCode, errorMessage, internalException);
    }

    public static ApiReturn<String> ofException(Exception exception) {
        return of(ErrorType.Exception, ErrorType.Exception.getCode(), exception.getMessage(), exception.getCause());
    }

    public static ApiReturn<String> ofKaspper(Exception ex) {
        return of(ex.getErrorType(), ex.getErrorCode(), ex.getMessage(), ex);
    }
}
