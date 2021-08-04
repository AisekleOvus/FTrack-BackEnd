package com.ftrack.Ftrack;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CoordinatesNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(CoordinatesNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String coordinatesNotFoundHandler(CoordinatesNotFoundException ex) {
        return ex.getMessage();
    }
}
