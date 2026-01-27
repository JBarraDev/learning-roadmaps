package com.jbarradev.week_01_challenge.exception;

public class NoteNotFoundException extends RuntimeException {

    public NoteNotFoundException(Long id) {
        super("La nota con id " + id + " no existe.");
    }

}
