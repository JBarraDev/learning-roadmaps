package com.jbarradev.week_01_challenge.service;

import com.jbarradev.week_01_challenge.domain.Note;
import com.jbarradev.week_01_challenge.dto.NoteRequestDTO;
import com.jbarradev.week_01_challenge.dto.NoteResponseDTO;
import com.jbarradev.week_01_challenge.exception.NoteNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    private final List<Note> notes = new ArrayList<>();
    private Long nextId = 1L;

    @Override
    public List<NoteResponseDTO> getAllNotes() {
        return notes.stream()
                .map(this::convertNoteToNoteResponseDTO)
                .toList();
    }

    @Override
    public NoteResponseDTO getNoteById(Long id) {
        return convertNoteToNoteResponseDTO(findNoteOrThrowException(id));
    }

    @Override
    public NoteResponseDTO createNote(NoteRequestDTO noteRequestDTO) {
        Note note = new Note(nextId++, noteRequestDTO.getTitle(), noteRequestDTO.getContent(), LocalDateTime.now());
        notes.add(note);
        return convertNoteToNoteResponseDTO(note);
    }

    @Override
    public NoteResponseDTO updateNote(Long id, NoteRequestDTO noteRequestDTO) {
        Note note = findNoteOrThrowException(id);
        note.setTitle(noteRequestDTO.getTitle());
        note.setContent(noteRequestDTO.getContent());
        return convertNoteToNoteResponseDTO(note);
    }

    @Override
    public void deleteNote(Long id) {
        Note note = findNoteOrThrowException(id);
        notes.remove(note);
    }

    @Override
    public List<NoteResponseDTO> findNotesByKeyword(String keyword) {
        return notes.stream()
                .filter(note -> note.getTitle()
                        .toLowerCase()
                        .contains(keyword.toLowerCase()))
                .map(this::convertNoteToNoteResponseDTO)
                .toList();
    }

    private Note findNoteOrThrowException(Long id) {
        return notes.stream()
                .filter(n -> n.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new NoteNotFoundException(id));
    }

    private NoteResponseDTO convertNoteToNoteResponseDTO(Note note) {
        return new NoteResponseDTO(note.getId(), note.getTitle(), note.getContent(), note.getCreatedAt());
    }

}
