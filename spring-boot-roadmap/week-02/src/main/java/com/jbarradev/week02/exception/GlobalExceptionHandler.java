package com.jbarradev.week02.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionResponseDTO> handleValidationErrors(MethodArgumentNotValidException ex) {

        String errors = ex.getBindingResult().getFieldErrors().stream()
                .map(err -> err.getField() + ": " + err.getDefaultMessage())
                .collect(Collectors.joining(", "));

        ExceptionResponseDTO error = new ExceptionResponseDTO(
                LocalDateTime.now(),
                "Error de validación",
                errors
        );

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(TaskNotFoundException.class)
    public ResponseEntity<ExceptionResponseDTO> handleTaskNotFound(TaskNotFoundException ex, WebRequest request) {
        ExceptionResponseDTO error = new ExceptionResponseDTO(LocalDateTime.now(), ex.getMessage(), request.getDescription(false) );
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ExceptionResponseDTO> handleIllegalArgumentException(IllegalArgumentException ex, WebRequest request) {
        ExceptionResponseDTO error = new ExceptionResponseDTO(LocalDateTime.now(), ex.getMessage(), request.getDescription(false) );
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
