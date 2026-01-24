package com.jbarradev.week01.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TaskRequestDTO {

    @NotBlank (message = "El título es obligatorio")
    private String title;

    @Size(min = 10, message = "El mensaje debe contener al menos 10 caracteres")
    private String description;

}
