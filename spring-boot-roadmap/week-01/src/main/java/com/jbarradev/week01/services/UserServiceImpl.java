package com.jbarradev.week01.services;

import com.jbarradev.week01.dtos.UserRequestDTO;
import com.jbarradev.week01.dtos.UserResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public UserResponseDTO createUser(UserRequestDTO userRequestDTO) {
        return new UserResponseDTO(userRequestDTO.getName(),  userRequestDTO.getEmail());
    }
}
