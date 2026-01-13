package com.sameperson3108.taskmanager;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

@Service
public class TaskService {

    private final Map<Long, Task> tasksMap = Map.of(
            1L, new Task(1L,
                    "Dinner",
                    "Create hamburgers",
                    LocalDate.now().plusDays(5),
                    TaskStatus.CREATED),
            2L, new Task(2L,
                    "Wash",
                    "Brush teeth",
                    LocalDate.now().plusDays(5),
                    TaskStatus.CREATED)
    );

    public Task getTaskById(Long id) {
        if (!tasksMap.containsKey(id)) throw new NoSuchElementException("Task with id " + id + " not found");
        return tasksMap.get(id);
    }

    public List<Task> findAllTasks() {
        return tasksMap.values().stream().toList();
    }
}
