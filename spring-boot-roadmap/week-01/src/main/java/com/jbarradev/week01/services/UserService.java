package com.jbarradev.week01.services;

import com.jbarradev.week01.dtos.UserRequestDTO;
import com.jbarradev.week01.dtos.UserResponseDTO;

public interface UserService {
    public UserResponseDTO createUser(UserRequestDTO userRequestDTO);
}
