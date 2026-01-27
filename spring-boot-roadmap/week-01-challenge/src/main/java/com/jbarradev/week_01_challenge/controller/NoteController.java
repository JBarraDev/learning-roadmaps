package com.jbarradev.week_01_challenge.controller;

import com.jbarradev.week_01_challenge.dto.NoteRequestDTO;
import com.jbarradev.week_01_challenge.dto.NoteResponseDTO;
import com.jbarradev.week_01_challenge.service.NoteService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/notes")
public class NoteController {

    private final NoteService noteService;

    @GetMapping
    public ResponseEntity<List<NoteResponseDTO>> getAllNotes() {
        return ResponseEntity.ok(noteService.getAllNotes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<NoteResponseDTO> getNoteById(@PathVariable Long id) {
        return ResponseEntity.ok(noteService.getNoteById(id));
    }

    @PostMapping
    public ResponseEntity<NoteResponseDTO> saveNote(@Valid @RequestBody NoteRequestDTO noteRequestDTO) {
        return ResponseEntity.ok(noteService.createNote(noteRequestDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<NoteResponseDTO> updateNote(@Valid @RequestBody NoteRequestDTO noteRequestDTO, @PathVariable Long id) {
        return ResponseEntity.ok(noteService.updateNote(id, noteRequestDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable Long id) {
        noteService.deleteNote(id);
        return ResponseEntity.ok("Nota con id " + id + " borrada correctamente.");
    }

    @GetMapping("/search")
    public ResponseEntity<List<NoteResponseDTO>> getAllNotesByKeyword(@RequestParam String keyword) {
        return ResponseEntity.ok(noteService.findNotesByKeyword(keyword));
    }

}
