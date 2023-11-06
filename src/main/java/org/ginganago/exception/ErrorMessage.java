package org.ginganago.exception;

import lombok.Data;

@Data
public class ErrorMessage {

    private String codeErreur;
    private String message;

    public ErrorMessage(ErrorEnum errorEnum, Long id) {
        super();
        this.codeErreur = errorEnum.getCode();
        this.message = errorEnum.getMessage() + " (id:" + id + ")";
    }


}