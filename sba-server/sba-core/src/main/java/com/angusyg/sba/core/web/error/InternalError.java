package com.angusyg.sba.core.web.error;

import org.springframework.http.HttpStatus;

public class InternalError extends ApiError {
    public InternalError() {
        super(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
    }
}
