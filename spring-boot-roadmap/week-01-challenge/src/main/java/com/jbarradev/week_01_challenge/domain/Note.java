package com.jbarradev.week_01_challenge.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Note {

    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
}