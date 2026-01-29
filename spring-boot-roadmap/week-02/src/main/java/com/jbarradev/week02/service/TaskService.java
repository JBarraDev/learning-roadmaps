package com.jbarradev.week02.service;

import com.jbarradev.week02.dto.TaskRequestDTO;
import com.jbarradev.week02.dto.TaskResponseDTO;

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
