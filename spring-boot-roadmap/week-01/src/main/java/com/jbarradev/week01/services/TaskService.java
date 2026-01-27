package com.jbarradev.week01.services;

import com.jbarradev.week01.dtos.TaskRequestDTO;
import com.jbarradev.week01.dtos.TaskResponseDTO;

import java.util.List;

public interface TaskService {
    List<TaskResponseDTO> getTasks();

    TaskResponseDTO getTaskById(Long id);

    TaskResponseDTO createTask(TaskRequestDTO task);

    void deleteTaskById(Long id);

    TaskResponseDTO updateTask(Long id, TaskRequestDTO task);

    TaskResponseDTO markTaskAsCompleted(Long id);

    TaskResponseDTO toggleTaskCompleted(Long id);
}
