package com.moe.taskapi.service;

import com.moe.taskapi.entity.Task;
import com.moe.taskapi.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repo;

    public TaskService(TaskRepository repo) {
        this.repo = repo;
    }

    public Task create(Task task) {
        task.setId(null);
        return repo.save(task);
    }

    public List<Task> getAll() {
        return repo.findAll();
    }

    public Task getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));
    }

    public Task update(Long id, Task updated) {
        Task existing = getById(id);
        existing.setTitle(updated.getTitle());
        existing.setDescription(updated.getDescription());
        existing.setCompleted(updated.isCompleted());
        return repo.save(existing);
    }

    public void delete(Long id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("Task not found");
        }
        repo.deleteById(id);
    }
}