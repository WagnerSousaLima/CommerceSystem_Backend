package com.wslprojects.springjpa.resources.exceptions;

import com.wslprojects.springjpa.services.exceptions.DatabaseException;
import com.wslprojects.springjpa.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;
import java.util.zip.DataFormatException;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandartError>
    resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
        String error = "Resouce not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandartError err = new StandartError
                (Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);

    }

    @ExceptionHandler(DataFormatException.class)
    public ResponseEntity<StandartError>
    database(DatabaseException e, HttpServletRequest request){
        String error = "Database error";
        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandartError err = new StandartError
                (Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);

    }

}
