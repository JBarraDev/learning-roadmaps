package com.jbarradev.week02.service;

import com.jbarradev.week02.domain.Task;
import com.jbarradev.week02.dto.TaskRequestDTO;
import com.jbarradev.week02.dto.TaskResponseDTO;
import com.jbarradev.week02.exception.InvalidTaskException;
import com.jbarradev.week02.exception.TaskNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private final List<Task> tasks = new ArrayList<>();
    private Long nextId = 1L;

    private static final Logger log = LoggerFactory.getLogger(TaskServiceImpl.class);

    @Override
    public TaskResponseDTO createTask(TaskRequestDTO taskRequestDTO) {
        Task task = new Task(nextId++, taskRequestDTO.getTitle(), taskRequestDTO.getDescription(), false);
        tasks.add(task);
        log.info("Creating task with title: {}", task.getTitle());
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
        checkNegativeId(id);
        Task task = findTask(id);
        return convertTaskToTaskResponseDTO(task);
    }

    @Override
    public void deleteTaskById(Long id) {
        checkNegativeId(id);
        Task task = findTask(id);
        tasks.remove(task);
        log.info("Deleting task with id: {}", id);
    }

    @Override
    public TaskResponseDTO updateTask(Long id, TaskRequestDTO taskRequestDTO) {
        checkNegativeId(id);
        Task task = findTask(id);

        task.setTitle(taskRequestDTO.getTitle());
        task.setDescription(taskRequestDTO.getDescription());
        log.info("Updating task with id: {}", id);
        return convertTaskToTaskResponseDTO(task);
    }

    @Override
    public TaskResponseDTO markTaskAsCompleted(Long id) {
        checkNegativeId(id);
        Task task = findTask(id);
        task.setCompleted(true);
        log.info("Marking task {} as completed", id);
        return convertTaskToTaskResponseDTO(task);
    }

    @Override
    public TaskResponseDTO toggleTaskCompleted(Long id) {
        checkNegativeId(id);
        Task task = findTask(id);
        task.setCompleted(!task.isCompleted());
        log.info("Toggling completion for task with id: {}. New status is {}.", id, task.isCompleted());
        return convertTaskToTaskResponseDTO(task);
    }

    private TaskResponseDTO convertTaskToTaskResponseDTO(Task task) {
        return new TaskResponseDTO(task.getId(), task.getTitle(), task.getDescription(), task.isCompleted());
    }

    private Task findTask(Long id) {
        log.info("Fetching task with id: {}", id);
        return tasks.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> {
                    log.warn("Task not found with id: {}", id);
                    return new TaskNotFoundException("La tarea con id " + id + " no existe");
                });
    }

    private void checkNegativeId(Long id) {
        if (id < 0) {
            log.warn("Invalid ID received: {}", id);
            throw new InvalidTaskException("El id no puede ser negativo");
        }
    }

}
