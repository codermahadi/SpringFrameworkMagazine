package com.mahadi.controller;

import org.springframework.dao.DataAccessException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by Mahadi on 10/21/2017.
 */

@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(DataAccessException.class)
    public String handleDatabaseException(DataAccessException ex){
        return "error";
    }

    @ExceptionHandler(AccessDeniedException.class)
    public String handleDeniedException(AccessDeniedException ex){
        return "denied";
    }

}
