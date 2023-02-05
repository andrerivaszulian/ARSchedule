package com.arsystrem.servicos.agendador.commons.error;

public enum ErrorType {
    /**
     * Erro de uma validação
     */
    Validation(400),
    /**
     * Erro de sem autorização
     */
    Unauthorized(401),
    /**
     * Erro de não encontrado
     */
    NotFound(404),
    /**
     * Erro retornado por conflito de informação.
     */
    Conflict(409),
    /**
     * Exception inexperada.
     */
    Exception(500);

    private final short code;

    private ErrorType(int code) {
        this.code = (short) code;
    }

    public short getCode() {
        return code;
    }

    /**
     * Recupera o tipo de erro com o mesmo código recebido.
     */
    public static ErrorType getErrorTypeForCode(int code) {
        switch (code) {
            case 400:
                return Validation;
            case 401:
                return Unauthorized;
            case 404:
                return NotFound;
            case 409:
                return Conflict;
            default:
                return Exception;
        }
    }
}
