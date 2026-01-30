package com.jbarradev.week02.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskRequestDTO {

    @NotBlank (message = "El título no debe estar vacío")
    private String title;

    @Size(min = 5, message = "La descripción debe tener al menos 5 caracteres")
    private String description;

}
