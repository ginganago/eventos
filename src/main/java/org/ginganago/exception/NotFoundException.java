package org.ginganago.exception;

import lombok.Getter;

@Getter
public class NotFoundException extends RuntimeException {

    private final ErrorEnum errorEnum;
    private final Long id;

    public NotFoundException(ErrorEnum errorEnum, Long id) {
        super();
        this.errorEnum = errorEnum;
        this.id = id;
    }
}
