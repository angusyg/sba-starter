package com.angusyg.sba.core.web.controller.advice;

import com.angusyg.sba.core.web.error.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice(annotations = RestController.class)
public class ExceptionHandlerAdvice extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ApiError defaultExceptionHandler(Exception ex) {
        return new ApiError(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), ex);
    }
}
