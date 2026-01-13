package com.sameperson3108.taskmanager;

import java.time.LocalDate;

public record Task(
        Long id,
        String name,
        String description,
        LocalDate deadLine,
        TaskStatus status
) {
}
