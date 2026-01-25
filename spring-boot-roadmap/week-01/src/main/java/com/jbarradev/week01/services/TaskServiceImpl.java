package com.jbarradev.week01.services;

import com.jbarradev.week01.domains.Task;
import com.jbarradev.week01.dtos.TaskRequestDTO;
import com.jbarradev.week01.dtos.TaskResponseDTO;
import com.jbarradev.week01.exceptions.TaskNotFoundException;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private final List<Task> tasks = new ArrayList<>();
    private Long nextId = 1L;

    @Override
    public TaskResponseDTO createTask(TaskRequestDTO taskRequestDTO) {
        Task task = new Task(nextId++, taskRequestDTO.getTitle(), taskRequestDTO.getDescription(), false);
        tasks.add(task);
        return convertTaskToTaskResponseDTO(task);
    }

    @Override
    public List<TaskResponseDTO> getTasks() {
        List<TaskResponseDTO> taskResponseDTOs  = new ArrayList<>();
        return tasks.stream()
                .map(TaskServiceImpl::convertTaskToTaskResponseDTO)
                .toList();
    }

    @Override
    public TaskResponseDTO getTaskById(Long id) {
        Task task = tasks.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new TaskNotFoundException(id));
        return convertTaskToTaskResponseDTO(task);
    }

    @Override
    public void deleteTaskById(Long id) {
        Task task = tasks.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new TaskNotFoundException(id));

        tasks.remove(task);
    }

    private static TaskResponseDTO convertTaskToTaskResponseDTO(Task task) {
        return new TaskResponseDTO(task.getId(),  task.getTitle(), task.getDescription(), task.isCompleted());
    }

}
