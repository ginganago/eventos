package org.ginganago.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jboss.resteasy.reactive.RestResponse;

@Getter
@AllArgsConstructor
public enum ErrorEnum {
    // NOT FOUND
    NOT_FOUND_EVENT("NOT_FOUND_EVENT", "", "L'évenement n'a pas été trouvé.", RestResponse.Status.NOT_FOUND);

        private final String code;
        private final String label;
        private final String message;
        private final RestResponse.Status status;
}
