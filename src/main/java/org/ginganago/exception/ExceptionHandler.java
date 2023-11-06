package org.ginganago.exception;

import org.jboss.resteasy.reactive.RestResponse;
import org.jboss.resteasy.reactive.server.ServerExceptionMapper;

public class ExceptionHandler {
    @ServerExceptionMapper
    public RestResponse<ErrorMessage> notFoundException(NotFoundException e) {
        return RestResponse.status(e.getErrorEnum().getStatus(), new ErrorMessage(e.getErrorEnum(), e.getId())
        );
    }
}