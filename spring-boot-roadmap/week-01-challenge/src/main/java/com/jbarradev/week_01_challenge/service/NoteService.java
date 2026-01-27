package com.jbarradev.week_01_challenge.service;

import com.jbarradev.week_01_challenge.dto.NoteRequestDTO;
import com.jbarradev.week_01_challenge.dto.NoteResponseDTO;

import java.util.List;

public interface NoteService {

    List<NoteResponseDTO> getAllNotes();

    NoteResponseDTO getNoteById(Long id);

    NoteResponseDTO createNote(NoteRequestDTO noteRequestDTO);

    NoteResponseDTO updateNote(Long id, NoteRequestDTO noteRequestDTO);

    void deleteNote(Long id);

}
