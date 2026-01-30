package com.jbarradev.week02.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class ExceptionResponseDTO {
    private LocalDateTime timestamp;
    private String message;
    private String details;
}
