package com.sameperson3108.taskmanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    private static final Logger logger = LoggerFactory.getLogger(TaskController.class);

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable("id") Long id) {
        logger.info("getTaskById: " + id );
        return taskService.getTaskById(id);
    }

    @GetMapping()
    public List<Task> getAllTasks() {
        logger.info("getAllTasks");
        return taskService.findAllTasks();
    }

}
