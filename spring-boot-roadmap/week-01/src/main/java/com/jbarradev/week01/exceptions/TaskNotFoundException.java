package com.jbarradev.week01.exceptions;

public class TaskNotFoundException extends RuntimeException{

    public TaskNotFoundException(Long id) {
        super("La tarea con id " + id + " no existe.");
    }

}
