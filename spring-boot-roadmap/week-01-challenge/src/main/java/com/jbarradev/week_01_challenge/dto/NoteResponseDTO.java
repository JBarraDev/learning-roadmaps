package com.jbarradev.week_01_challenge.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteResponseDTO {

    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAy;
}
