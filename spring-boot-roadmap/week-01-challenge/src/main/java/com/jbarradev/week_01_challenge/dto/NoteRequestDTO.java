package com.jbarradev.week_01_challenge.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class NoteRequestDTO {

    @NotBlank(message = "El título no puede estar vacío.")
    private String title;

    @Size(min = 10, message = "El contenido debe tener al menos 10 caracteres.")
    private String content;

}
