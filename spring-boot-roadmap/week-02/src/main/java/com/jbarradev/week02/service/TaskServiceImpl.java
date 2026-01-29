package com.jbarradev.week02.service;

import com.jbarradev.week02.domain.Task;
import com.jbarradev.week02.dto.TaskRequestDTO;
import com.jbarradev.week02.dto.TaskResponseDTO;
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
        return tasks.stream()
                .map(this::convertTaskToTaskResponseDTO)
                .toList();
    }

    @Override
    public TaskResponseDTO getTaskById(Long id) {
        Task task = findTask(id);
        return convertTaskToTaskResponseDTO(task);
    }

    @Override
    public void deleteTaskById(Long id) {
        Task task = findTask(id);
        tasks.remove(task);
    }

    @Override
    public TaskResponseDTO updateTask(Long id, TaskRequestDTO taskRequestDTO) {
        Task task = findTask(id);

        task.setTitle(taskRequestDTO.getTitle());
        task.setDescription(taskRequestDTO.getDescription());

        return convertTaskToTaskResponseDTO(task);
    }

    @Override
    public TaskResponseDTO markTaskAsCompleted(Long id) {
        Task task = findTask(id);
        task.setCompleted(true);
        return convertTaskToTaskResponseDTO(task);
    }

    @Override
    public TaskResponseDTO toggleTaskCompleted(Long id) {
        Task task = findTask(id);
        task.setCompleted(!task.isCompleted());
        return convertTaskToTaskResponseDTO(task);
    }

    private TaskResponseDTO convertTaskToTaskResponseDTO(Task task) {
        return new TaskResponseDTO(task.getId(), task.getTitle(), task.getDescription(), task.isCompleted());
    }

    private Task findTask(Long id) {
        return tasks.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}
