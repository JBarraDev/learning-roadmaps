package com.jbarradev.week01.controllers;

import com.jbarradev.week01.dtos.UserRequestDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public ResponseEntity<?> createUser(@Valid @RequestBody UserRequestDTO request){
        return ResponseEntity.ok(
                "Usuario recibido: " + request.getName() + " (" + request.getEmail() + ")"
        );
    }
}
